# Auto-Generated by cargo-bitbake 0.3.16


# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include printnanny-snapshot-${PV}.inc
include printnanny-snapshot.inc
include printnanny-rs.inc


inherit cargo

CARGO_SRC_DIR = "snapshot"
PV:append = "0.1.0-git${SRCPV}"

SUMMARY = "Serve the latest JPEG snapshot from a directory"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-rs.git"
LICENSE = "AGPL-3.0-or-later"

