# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get printnanny-cli could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/printnanny-cli/0.33.1"
SRC_URI += "git://git@github.com/bitsy-ai/printnanny-rs.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "cli"
PV:append = "0.33.1-git${SRCPV}"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aead/0.5.1 \
    crate://crates.io/aes-gcm/0.10.1 \
    crate://crates.io/aes/0.8.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/ahash/0.8.2 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anyhow/1.0.68 \
    crate://crates.io/array-init-cursor/0.2.0 \
    crate://crates.io/arrayvec/0.5.2 \
    crate://crates.io/arrow-buffer/23.0.0 \
    crate://crates.io/arrow-format/0.7.0 \
    crate://crates.io/arrow/23.0.0 \
    crate://crates.io/arrow2/0.14.2 \
    crate://crates.io/assert_cmd/2.0.8 \
    crate://crates.io/async-broadcast/0.5.0 \
    crate://crates.io/async-channel/1.8.0 \
    crate://crates.io/async-compression/0.3.15 \
    crate://crates.io/async-executor/1.5.0 \
    crate://crates.io/async-io/1.12.0 \
    crate://crates.io/async-lock/2.6.0 \
    crate://crates.io/async-nats/0.26.0 \
    crate://crates.io/async-process/1.6.0 \
    crate://crates.io/async-recursion/1.0.0 \
    crate://crates.io/async-stream-impl/0.3.3 \
    crate://crates.io/async-stream/0.3.3 \
    crate://crates.io/async-task/4.3.0 \
    crate://crates.io/async-trait/0.1.61 \
    crate://crates.io/atomic-waker/1.1.0 \
    crate://crates.io/atomic/0.5.1 \
    crate://crates.io/atomic_refcell/0.1.9 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/base64-url/1.4.13 \
    crate://crates.io/base64/0.12.3 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.20.0 \
    crate://crates.io/base64/0.21.0 \
    crate://crates.io/base64ct/1.1.1 \
    crate://crates.io/bigdecimal/0.3.0 \
    crate://crates.io/binascii/0.1.4 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.3 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/blocking/1.3.0 \
    crate://crates.io/bstr/0.2.17 \
    crate://crates.io/bstr/1.1.0 \
    crate://crates.io/buf_redux/0.8.4 \
    crate://crates.io/bumpalo/3.12.0 \
    crate://crates.io/byte-slice-cast/1.2.2 \
    crate://crates.io/bytemuck/1.12.3 \
    crate://crates.io/bytemuck_derive/1.3.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.3.0 \
    crate://crates.io/cc/1.0.78 \
    crate://crates.io/cfg-expr/0.11.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.23 \
    crate://crates.io/cipher/0.4.3 \
    crate://crates.io/clap/3.2.23 \
    crate://crates.io/clap_derive/3.2.18 \
    crate://crates.io/clap_lex/0.2.4 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/comfy-table/5.0.1 \
    crate://crates.io/concurrent-queue/2.1.0 \
    crate://crates.io/config/0.11.0 \
    crate://crates.io/console/0.14.1 \
    crate://crates.io/const-oid/0.6.2 \
    crate://crates.io/const-random-macro/0.1.15 \
    crate://crates.io/const-random/0.1.15 \
    crate://crates.io/cookie/0.16.2 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cpufeatures/0.2.5 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.6 \
    crate://crates.io/crossbeam-deque/0.8.2 \
    crate://crates.io/crossbeam-epoch/0.9.13 \
    crate://crates.io/crossbeam-utils/0.8.14 \
    crate://crates.io/crossterm/0.23.2 \
    crate://crates.io/crossterm_winapi/0.9.0 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/csv-core/0.1.10 \
    crate://crates.io/csv/1.1.6 \
    crate://crates.io/ctr/0.9.2 \
    crate://crates.io/curve25519-dalek/3.2.0 \
    crate://crates.io/cxx-build/1.0.86 \
    crate://crates.io/cxx/1.0.86 \
    crate://crates.io/cxxbridge-flags/1.0.86 \
    crate://crates.io/cxxbridge-macro/1.0.86 \
    crate://crates.io/data-encoding/2.3.3 \
    crate://crates.io/der/0.4.5 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/derive_more/0.99.17 \
    crate://crates.io/devise/0.3.1 \
    crate://crates.io/devise_codegen/0.3.1 \
    crate://crates.io/devise_core/0.3.1 \
    crate://crates.io/dialoguer/0.8.0 \
    crate://crates.io/diesel/2.0.2 \
    crate://crates.io/diesel_derives/2.0.1 \
    crate://crates.io/diesel_migrations/2.0.0 \
    crate://crates.io/difference/2.0.0 \
    crate://crates.io/difflib/0.4.0 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/doc-comment/0.3.3 \
    crate://crates.io/downcast/0.10.0 \
    crate://crates.io/dyn-clone/1.0.10 \
    crate://crates.io/ed25519-dalek/1.0.1 \
    crate://crates.io/ed25519/1.5.3 \
    crate://crates.io/educe/0.4.20 \
    crate://crates.io/either/1.8.0 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/encoding_rs/0.8.31 \
    crate://crates.io/enum-ordinalize/3.1.12 \
    crate://crates.io/enumflags2/0.7.5 \
    crate://crates.io/enumflags2_derive/0.7.4 \
    crate://crates.io/env_logger/0.9.3 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.2.8 \
    crate://crates.io/ethnum/1.3.2 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fallible-streaming-iterator/0.1.9 \
    crate://crates.io/fastrand/1.8.0 \
    crate://crates.io/figment/0.10.8 \
    crate://crates.io/file-lock/2.1.6 \
    crate://crates.io/flatbuffers/2.1.2 \
    crate://crates.io/flate2/1.0.25 \
    crate://crates.io/float-cmp/0.8.0 \
    crate://crates.io/float-cmp/0.9.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/foreign_vec/0.1.0 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/fragile/1.2.2 \
    crate://crates.io/fragile/2.0.0 \
    crate://crates.io/fuchsia-cprng/0.1.1 \
    crate://crates.io/function_name-proc-macro/0.2.3 \
    crate://crates.io/function_name/0.2.3 \
    crate://crates.io/futures-channel/0.3.25 \
    crate://crates.io/futures-core/0.3.25 \
    crate://crates.io/futures-executor/0.3.25 \
    crate://crates.io/futures-io/0.3.25 \
    crate://crates.io/futures-lite/1.12.0 \
    crate://crates.io/futures-macro/0.3.25 \
    crate://crates.io/futures-sink/0.3.25 \
    crate://crates.io/futures-task/0.3.25 \
    crate://crates.io/futures-util/0.3.25 \
    crate://crates.io/futures/0.3.25 \
    crate://crates.io/fxhash/0.2.1 \
    crate://crates.io/generator/0.7.2 \
    crate://crates.io/generic-array/0.14.6 \
    crate://crates.io/getrandom/0.2.8 \
    crate://crates.io/ghash/0.5.0 \
    crate://crates.io/gimli/0.27.0 \
    crate://crates.io/gio-sys/0.16.3 \
    crate://crates.io/git-version-macro/0.3.5 \
    crate://crates.io/git-version/0.3.5 \
    crate://crates.io/git2/0.15.0 \
    crate://crates.io/glib-macros/0.16.3 \
    crate://crates.io/glib-sys/0.16.3 \
    crate://crates.io/glib/0.16.7 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/gobject-sys/0.16.3 \
    crate://crates.io/gst-plugin-version-helper/0.7.5 \
    crate://crates.io/gstreamer-app-sys/0.19.2 \
    crate://crates.io/gstreamer-app/0.19.6 \
    crate://crates.io/gstreamer-base-sys/0.19.3 \
    crate://crates.io/gstreamer-base/0.19.3 \
    crate://crates.io/gstreamer-check-sys/0.19.2 \
    crate://crates.io/gstreamer-check/0.19.2 \
    crate://crates.io/gstreamer-sys/0.19.4 \
    crate://crates.io/gstreamer-video-sys/0.19.5 \
    crate://crates.io/gstreamer-video/0.19.5 \
    crate://crates.io/gstreamer/0.19.6 \
    crate://crates.io/h2/0.3.15 \
    crate://crates.io/half/2.2.1 \
    crate://crates.io/halfbrown/0.1.18 \
    crate://crates.io/hash_hasher/2.0.3 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hashbrown/0.13.2 \
    crate://crates.io/headers-core/0.2.0 \
    crate://crates.io/headers/0.3.8 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hkdf/0.12.3 \
    crate://crates.io/hmac/0.12.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.8 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-tls/0.5.0 \
    crate://crates.io/hyper/0.14.23 \
    crate://crates.io/iana-time-zone-haiku/0.1.1 \
    crate://crates.io/iana-time-zone/0.1.53 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/indexmap/1.9.2 \
    crate://crates.io/infer/0.3.7 \
    crate://crates.io/inlinable_string/0.1.15 \
    crate://crates.io/inout/0.1.3 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.4 \
    crate://crates.io/ipnet/2.7.1 \
    crate://crates.io/ipnetwork/0.20.0 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/0.4.8 \
    crate://crates.io/itoa/1.0.5 \
    crate://crates.io/jobserver/0.1.25 \
    crate://crates.io/js-sys/0.3.60 \
    crate://crates.io/json-deserializer/0.4.4 \
    crate://crates.io/json/0.12.4 \
    crate://crates.io/jsonwebtoken/7.2.0 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lexical-core/0.7.6 \
    crate://crates.io/lexical-core/0.8.5 \
    crate://crates.io/lexical-parse-float/0.8.5 \
    crate://crates.io/lexical-parse-integer/0.8.6 \
    crate://crates.io/lexical-util/0.8.5 \
    crate://crates.io/lexical-write-float/0.8.5 \
    crate://crates.io/lexical-write-integer/0.8.5 \
    crate://crates.io/lexical/6.1.1 \
    crate://crates.io/libc/0.2.139 \
    crate://crates.io/libgit2-sys/0.14.1+1.5.0 \
    crate://crates.io/libm/0.2.6 \
    crate://crates.io/libsqlite3-sys/0.25.2 \
    crate://crates.io/libssh2-sys/0.2.23 \
    crate://crates.io/libz-sys/1.1.8 \
    crate://crates.io/link-cplusplus/1.0.8 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linux-raw-sys/0.1.4 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/loom/0.5.6 \
    crate://crates.io/lz4-sys/1.9.4 \
    crate://crates.io/lz4/1.24.0 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matrixmultiply/0.3.2 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memmap2/0.5.8 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/migrations_internals/2.0.0 \
    crate://crates.io/migrations_macros/2.0.0 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/mime_serde_shim/0.2.2 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/mio/0.8.5 \
    crate://crates.io/mktemp/0.4.1 \
    crate://crates.io/mockall/0.10.2 \
    crate://crates.io/mockall_derive/0.10.2 \
    crate://crates.io/muldiv/1.0.1 \
    crate://crates.io/multer/2.0.4 \
    crate://crates.io/multipart/0.18.0 \
    crate://crates.io/multiversion-macros/0.6.1 \
    crate://crates.io/multiversion/0.6.1 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nats/0.23.1 \
    crate://crates.io/ndarray/0.15.6 \
    crate://crates.io/nix/0.24.3 \
    crate://crates.io/nix/0.25.1 \
    crate://crates.io/nix/0.26.2 \
    crate://crates.io/nkeys/0.2.0 \
    crate://crates.io/nom/5.1.2 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/ntapi/0.4.0 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/nuid/0.3.2 \
    crate://crates.io/num-bigint/0.2.6 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-complex/0.4.2 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-iter/0.1.43 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.1.43 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num/0.4.0 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/object/0.30.2 \
    crate://crates.io/once_cell/1.17.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/openssl-macros/0.1.0 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-sys/0.9.80 \
    crate://crates.io/openssl/0.10.45 \
    crate://crates.io/option-operations/0.5.0 \
    crate://crates.io/ordered-stream/0.1.3 \
    crate://crates.io/os_str_bytes/6.4.1 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.6 \
    crate://crates.io/paste/1.0.11 \
    crate://crates.io/pear/0.2.3 \
    crate://crates.io/pear_codegen/0.2.3 \
    crate://crates.io/pem-rfc7468/0.2.4 \
    crate://crates.io/pem/0.8.3 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pin-project-internal/1.0.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.0.12 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkcs8/0.7.6 \
    crate://crates.io/pkg-config/0.3.26 \
    crate://crates.io/planus/0.3.1 \
    crate://crates.io/polars-algo/0.24.3 \
    crate://crates.io/polars-arrow/0.24.4 \
    crate://crates.io/polars-core/0.24.3 \
    crate://crates.io/polars-io/0.24.3 \
    crate://crates.io/polars-lazy/0.24.3 \
    crate://crates.io/polars-ops/0.24.3 \
    crate://crates.io/polars-time/0.24.3 \
    crate://crates.io/polars-utils/0.24.4 \
    crate://crates.io/polars/0.24.3 \
    crate://crates.io/polling/2.5.2 \
    crate://crates.io/polyval/0.6.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/predicates-core/1.0.5 \
    crate://crates.io/predicates-tree/1.0.7 \
    crate://crates.io/predicates/1.0.8 \
    crate://crates.io/predicates/2.1.5 \
    crate://crates.io/pretty-hex/0.3.0 \
    crate://crates.io/printnanny-api-client/0.129.1 \
    crate://crates.io/printnanny-octoprint-models/0.1.3 \
    crate://crates.io/printnanny-os-models/0.1.0 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.2.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.20+deprecated \
    crate://crates.io/proc-macro2-diagnostics/0.9.1 \
    crate://crates.io/proc-macro2/1.0.50 \
    crate://crates.io/procfs/0.12.0 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/1.0.23 \
    crate://crates.io/r2d2/0.8.10 \
    crate://crates.io/rand/0.4.6 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.3.1 \
    crate://crates.io/rand_core/0.4.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_distr/0.4.3 \
    crate://crates.io/rawpointer/0.2.1 \
    crate://crates.io/rayon-core/1.10.1 \
    crate://crates.io/rayon/1.6.1 \
    crate://crates.io/rdrand/0.4.0 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/ref-cast-impl/1.0.14 \
    crate://crates.io/ref-cast/1.0.14 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.28 \
    crate://crates.io/regex/1.7.1 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/reqwest/0.11.13 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rocket/0.5.0-rc.2 \
    crate://crates.io/rocket_codegen/0.5.0-rc.2 \
    crate://crates.io/rocket_http/0.5.0-rc.2 \
    crate://crates.io/rust-ini/0.13.0 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.36.7 \
    crate://crates.io/rustls-native-certs/0.5.0 \
    crate://crates.io/rustls-native-certs/0.6.2 \
    crate://crates.io/rustls-pemfile/0.2.1 \
    crate://crates.io/rustls-pemfile/1.0.2 \
    crate://crates.io/rustls/0.19.1 \
    crate://crates.io/rustls/0.20.8 \
    crate://crates.io/rustversion/1.0.11 \
    crate://crates.io/ryu/1.0.12 \
    crate://crates.io/safemem/0.3.3 \
    crate://crates.io/schannel/0.1.21 \
    crate://crates.io/scheduled-thread-pool/0.2.6 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/scratch/1.0.3 \
    crate://crates.io/sct/0.6.1 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/security-framework-sys/2.6.1 \
    crate://crates.io/security-framework/2.7.0 \
    crate://crates.io/semver/1.0.16 \
    crate://crates.io/serde-hjson/0.9.1 \
    crate://crates.io/serde-reflection/0.3.6 \
    crate://crates.io/serde/0.8.23 \
    crate://crates.io/serde/1.0.152 \
    crate://crates.io/serde_bytes/0.11.8 \
    crate://crates.io/serde_derive/1.0.152 \
    crate://crates.io/serde_json/1.0.91 \
    crate://crates.io/serde_nanos/0.1.2 \
    crate://crates.io/serde_repr/0.1.10 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/serde_variant/0.1.1 \
    crate://crates.io/serde_yaml/0.9.16 \
    crate://crates.io/sha-1/0.10.1 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/signal-hook-mio/0.2.3 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/signal-hook/0.3.14 \
    crate://crates.io/signatory/0.23.2 \
    crate://crates.io/signature/1.6.4 \
    crate://crates.io/simd-json/0.6.0 \
    crate://crates.io/simdutf8/0.1.4 \
    crate://crates.io/simple_asn1/0.4.1 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/smartstring/1.0.1 \
    crate://crates.io/socket2/0.4.7 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spin/0.9.4 \
    crate://crates.io/spki/0.4.1 \
    crate://crates.io/stable-pattern/0.1.0 \
    crate://crates.io/state/0.5.3 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/streaming-iterator/0.1.9 \
    crate://crates.io/strength_reduce/0.2.4 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strum/0.23.0 \
    crate://crates.io/strum_macros/0.23.1 \
    crate://crates.io/subslice/0.2.3 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.107 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/sys-info/0.9.1 \
    crate://crates.io/sysinfo/0.26.9 \
    crate://crates.io/system-deps/6.0.3 \
    crate://crates.io/tempdir/0.3.7 \
    crate://crates.io/tempfile/3.3.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/terminal_size/0.1.17 \
    crate://crates.io/terminal_size/0.2.3 \
    crate://crates.io/termtree/0.4.0 \
    crate://crates.io/test-log/0.2.11 \
    crate://crates.io/textwrap/0.16.0 \
    crate://crates.io/thiserror-impl/1.0.38 \
    crate://crates.io/thiserror/1.0.38 \
    crate://crates.io/thread_local/1.1.4 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.6 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/time/0.3.17 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-macros/1.8.2 \
    crate://crates.io/tokio-native-tls/0.3.0 \
    crate://crates.io/tokio-retry/0.3.0 \
    crate://crates.io/tokio-rustls/0.22.0 \
    crate://crates.io/tokio-rustls/0.23.4 \
    crate://crates.io/tokio-serde/0.8.0 \
    crate://crates.io/tokio-stream/0.1.11 \
    crate://crates.io/tokio-tungstenite/0.17.2 \
    crate://crates.io/tokio-util/0.7.4 \
    crate://crates.io/tokio/1.24.2 \
    crate://crates.io/toml/0.5.10 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.23 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.16 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/try-lock/0.2.4 \
    crate://crates.io/tungstenite/0.17.3 \
    crate://crates.io/twoway/0.1.8 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/ubyte/0.10.3 \
    crate://crates.io/uds_windows/1.0.2 \
    crate://crates.io/uncased/0.9.7 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.8 \
    crate://crates.io/unicode-ident/1.0.6 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.0 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/universal-hash/0.5.0 \
    crate://crates.io/unsafe-libyaml/0.2.5 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/utf-8/0.7.6 \
    crate://crates.io/uuid/0.8.2 \
    crate://crates.io/uuid/1.2.2 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/value-trait/0.4.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/warp/0.3.3 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.83 \
    crate://crates.io/wasm-bindgen-futures/0.4.33 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.83 \
    crate://crates.io/wasm-bindgen-macro/0.2.83 \
    crate://crates.io/wasm-bindgen-shared/0.2.83 \
    crate://crates.io/wasm-bindgen/0.2.83 \
    crate://crates.io/web-sys/0.3.60 \
    crate://crates.io/webpki/0.21.4 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/wepoll-ffi/0.1.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.42.0 \
    crate://crates.io/windows/0.39.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.1 \
    crate://crates.io/windows_aarch64_msvc/0.39.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.1 \
    crate://crates.io/windows_i686_gnu/0.39.0 \
    crate://crates.io/windows_i686_gnu/0.42.1 \
    crate://crates.io/windows_i686_msvc/0.39.0 \
    crate://crates.io/windows_i686_msvc/0.42.1 \
    crate://crates.io/windows_x86_64_gnu/0.39.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.1 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.1 \
    crate://crates.io/windows_x86_64_msvc/0.39.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.1 \
    crate://crates.io/winreg/0.10.1 \
    crate://crates.io/yaml-rust/0.4.5 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zbus/3.7.0 \
    crate://crates.io/zbus_macros/3.7.0 \
    crate://crates.io/zbus_names/2.5.0 \
    crate://crates.io/zbus_systemd/0.0.8 \
    crate://crates.io/zeroize/1.5.7 \
    crate://crates.io/zeroize_derive/1.3.3 \
    crate://crates.io/zip/0.6.3 \
    crate://crates.io/zstd-safe/5.0.2+zstd.1.5.2 \
    crate://crates.io/zstd-sys/2.0.5+zstd.1.5.2 \
    crate://crates.io/zstd/0.11.2+zstd.1.5.2 \
    crate://crates.io/zvariant/3.10.0 \
    crate://crates.io/zvariant_derive/3.10.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://cli/LICENSE;md5=26bc145b58bd4e5d617276478377373f \
"

SUMMARY = "PrintNanny Command-line Interface"
HOMEPAGE = "https://github.com/bitsy-ai/printnanny-rs.git"
LICENSE = "AGPL-3.0-or-later"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include printnanny-cli-${PV}.inc
include printnanny-cli.inc
