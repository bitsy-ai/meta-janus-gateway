SUMMARY = "Klipper is a 3d-Printer firmware"
HOMEPAGE = "https://www.klipper3d.org/"
LICENSE = "GPL-3.0-or-later"

SRC_URI = "\
    https://github.com/mainsail-crew/mainsail/releases/download/v${PV}/mainsail.zip;subdir=mainsail \
    file://nginx/mainsail.nginx.upstream.conf \
    file://nginx/mainsail.nginx.common.conf \
    file://nginx/mainsail.nginx.locations \
    file://mainsail.target \
"
SRC_URI[sha256sum] = "93195529e8226652c8db1fc55cb69fcb3372ab327cb25c56469780e2c527c3b6"
S = "${WORKDIR}/mainsail"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-3.0-or-later;md5=1c76c4cc354acaac30ed4d5eefea7245"

INSTALL_DIR = "/opt/mainsail"
inherit systemd

do_install() {
    install -d "${D}${INSTALL_DIR}"
    cp --preserve=mode,timestamps -R ${WORKDIR}/mainsail/* ${D}${INSTALL_DIR}
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'nginx', d)}" ]; then
        install -d "${D}${sysconfdir}/nginx/conf.d/"
        install -d "${D}${sysconfdir}/nginx/locations/"

        install -m 0644 "${WORKDIR}/nginx/mainsail.nginx.upstream.conf" "${D}${sysconfdir}/nginx/conf.d/mainsail.upstream.conf"
        install -m 0644 "${WORKDIR}/nginx/mainsail.nginx.common.conf" "${D}${sysconfdir}/nginx/conf.d/mainsail.nginx.common.conf"
        ln -s -r "${D}${sysconfdir}/nginx/mainsail.nginx.locations" "${D}${sysconfdir}/nginx/locations/mainsail.nginx.locations"
    fi
    if [ "${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)}" ]; then
            install -d "${D}${systemd_system_unitdir}"
            install -m 0644 "${WORKDIR}/mainsail.target" "${D}${systemd_system_unitdir}/mainsail.target"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES','systemd','${PN}','',d)}"
SYSTEMD_SERVICE:${PN} = "mainsail.target"
SYSTEMD_AUTO_ENABLE = "disable"

FILES:${PN} = "${INSTALL_DIR}/*"
FILES:${PN}-nginx = "${sysconfdir}/nginx/*"

PACKAGES = "${PN} ${PN}-nginx"
