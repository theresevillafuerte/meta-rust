SRCREV = "52d4526e1bea858f08014cb48bee0ad02059ab63"
require rust-git.inc

SRC_URI_append = "\
	file://0001-libstd-io-process-Command-fully-quote-and-escape-the.patch \
	file://0002-std-io-process-add-Show-tests.patch \
	file://0003-platform.mk-avoid-choking-on-i586.patch \
	file://0004-mk-rt-compiler_rt-pass-LDFLAGS-from-CFG_GCCISH_LINK_.patch \
	file://0005-Target-add-default-target.json-path-libdir-rust-targ.patch \
	file://0006-mk-for-stage0-use-RUSTFLAGS-to-override-target-libs-.patch \
	file://0007-mk-add-missing-CFG_LIBDIR_RELATIVE.patch \
	file://0008-configure-support-bindir-and-extend-libdir-to-non-bl.patch \
	file://0009-XXX-remove-conflicting-realpath-hack.patch \
	file://0010-XXX-configure-unneeded-windows-check.patch \
	file://0011-Parallelize-submake-invocations.patch \
"