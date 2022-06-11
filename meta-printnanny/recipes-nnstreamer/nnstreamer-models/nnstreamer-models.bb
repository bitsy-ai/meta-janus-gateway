DESCRIPTION = "Models intended for use with Nnstreamer or TF Lite API"
LICENSE = "AGPLv3+"
HOMEPAGE = "https://printnanny.ai"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/AGPL-3.0-or-later;md5=a4af3f9f0c0fc9de318e4df46665906e"
SRC_URI = "\
    https://cdn.print-nanny.com/ml/print3d_20201101015829/model.tflite;name=model \
    https://cdn.print-nanny.com/ml/print3d_20201101015829/dict.txt;name=labels \
    https://cdn.print-nanny.com/ml/print3d_20201101015829/tflite_metadata.json;name=metadata \
    file://nnstreamer-rtph264pay.sh \
"

SRC_URI[model.sha256sum] = "b67ee7befefe10e20bf62986baf5e800a939359566db7c7a881f58ab568a265d"
SRC_URI[labels.sha256sum] = "f4ab59aecca74509dde2450a02b97cd107bf2f1b7940cf1394175c8e83d061b2"
SRC_URI[metadata.sha256sum] = "be8328a11f244065eed0b3579fb27048df95d39a89971a58f8f005cd6b7430ed"

do_install(){
    install -d ${D}${datadir}/printnanny/model
    install -d ${D}${bindir}
    install -m 0644 ${WORKDIR}/model.tflite ${D}${datadir}/printnanny/model/model.tflite
    install -m 0644 ${WORKDIR}/dict.txt ${D}${datadir}/printnanny/model/dict.txt
    install -m 0644 ${WORKDIR}/tflite_metadata.json ${D}${datadir}/printnanny/model/dict.txt
    install -m 0755 ${WORKDIR}/nnstreamer-rtph264pay.sh ${D}${bindir}/nnstreamer-rtph264pay
}

FILES:${PN} = "${datadir} ${bindir}"
RDEPENDS:${PN} = "nnstreamer nnstreamer-tensorflow-lite"
