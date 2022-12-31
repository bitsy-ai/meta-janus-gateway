#!/usr/bin/env bash

set -euo pipefail

FIX_PRINTNANNY_GROUP=(
    "/etc/printnanny"
)

FIX_PRINTNANNY_USER_GROUP=(
    "/home/printnanny"
)

for f in "${FIX_PRINTNANNY_GROUP[@]}"
do
    chmod -R u=rwx,g=rwx,o=rx "$f"
    chown -R :printnanny "$f"
done

for f in "${FIX_PRINTNANNY_USER_GROUP[@]}"
do
    chmod -R u=rwx,g=rwx,o=rx "$f"
    chown -R printnanny:printnanny "$f"
done
