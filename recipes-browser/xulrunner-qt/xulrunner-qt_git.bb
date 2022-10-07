SRC_URI = " \
	gitsm://github.com/sailfishos/gecko-dev.git;branch=master;protocol=https \
	file://fixes/0001-Bug-1545437-Add-options-to-specify-Rust-target-name.patch;patchdir=gecko-dev \
	file://fixes/avoid-running-autoconf2.13.patch;patchdir=gecko-dev \
	file://fixes/0001-Pre-generated-old-configure.patch;patchdir=gecko-dev \
	file://sailfishos/0001-sailfishos-gecko-Add-symlink-to-embedlite.-JB-52893.patch;patchdir=gecko-dev \
	file://sailfishos/0002-sailfishos-qt-Bring-back-Qt-layer.-JB-50505.patch;patchdir=gecko-dev \
	file://sailfishos/0003-sailfishos-ipc-Whitelist-sync-messages-of-EmbedLite..patch;patchdir=gecko-dev \
	file://sailfishos/0004-sailfishos-gecko-Remove-x11-dependency-declaration-f.patch;patchdir=gecko-dev \
	file://sailfishos/0005-sailfishos-gecko-Disable-unaligned-FP-access-emulati.patch;patchdir=gecko-dev \
	file://sailfishos/0006-sailfishos-gecko-Fix-embedlite-building.-JB-50505.patch;patchdir=gecko-dev \
	file://sailfishos/0007-sailfishos-gecko-Disable-MOC-code-generation-for-mes.patch;patchdir=gecko-dev \
	file://sailfishos/0008-sailfishos-qt-Add-Qt-headers-to-system-headers.-Fixe.patch;patchdir=gecko-dev \
	file://sailfishos/0009-sailfishos-gecko-Backport-Embed-MessageLoop-contruct.patch;patchdir=gecko-dev \
	file://sailfishos/0010-sailfishos-gecko-Add-including-of-nsRefPtrHashtable..patch;patchdir=gecko-dev \
	file://sailfishos/0011-sailfishos-compositor-Fix-GLContextProvider-defines.patch;patchdir=gecko-dev\
	file://sailfishos/0012-sailfishos-gecko-Disable-Gecko-Rust-Feature-cubeb-re.patch;patchdir=gecko-dev \
	file://sailfishos/0013-Bug-1685883-building-with-disable-marionette-fails-w.patch;patchdir=gecko-dev \
	file://sailfishos/0014-sailfishos-gecko-Enable-Pango-for-the-build.-JB-5086.patch;patchdir=gecko-dev \
	file://sailfishos/0015-Revert-Bug-1567888-remove-unneeded-QT-related-rules-.patch;patchdir=gecko-dev \
	file://sailfishos/0016-sailfishos-qt-Provide-checkbox-radio-renderer-for-Sa.patch;patchdir=gecko-dev \
	file://sailfishos/0017-sailfishos-gecko-Add-missing-include-for-nsIObserver.patch;patchdir=gecko-dev \
	file://sailfishos/0018-sailfishos-compositor-Make-it-possible-to-extend-Com.patch;patchdir=gecko-dev \
	file://sailfishos/0019-sailfishos-mozglue-Introduce-EmbedInitGlue-to-the-mo.patch;patchdir=gecko-dev \
	file://sailfishos/0020-sailfishos-compositor-Allow-compositor-specializatio.patch;patchdir=gecko-dev \
	file://sailfishos/0021-sailfishos-gecko-Hackish-fix-for-preferences-usage-i.patch;patchdir=gecko-dev \
	file://sailfishos/0022-sailfishos-gecko-Force-to-build-mozglue-and-xpcomglu.patch;patchdir=gecko-dev \
	file://sailfishos/0023-Revert-Bug-445128-Stop-putting-the-version-number-in.patch;patchdir=gecko-dev \
	file://sailfishos/0024-Revert-Bug-1427455-Remove-unused-variables-from-base.patch;patchdir=gecko-dev \
	file://sailfishos/0025-Revert-Bug-1333826-Remove-SDK_FILES-SDK_LIBRARY-and-.patch;patchdir=gecko-dev \
	file://sailfishos/0026-Revert-Bug-1333826-Remove-the-make-sdk-build-target-.patch;patchdir=gecko-dev \
	file://sailfishos/0027-Revert-Bug-1333826-Remove-a-few-references-from-.mk-.patch;patchdir=gecko-dev \
	file://sailfishos/0028-sailfishos-configure-Disable-LTO-for-rust-1.52.1-wit.patch;patchdir=gecko-dev \
	file://sailfishos/0029-sailfishos-gecko-Add-missing-GetTotalScreenPixels-fo.patch;patchdir=gecko-dev \
	file://sailfishos/0030-sailfishos-fonts-Load-and-set-FTLibrary-for-the-Fact.patch;patchdir=gecko-dev \
	file://sailfishos/0031-sailfishos-gecko-Create-EmbedLiteCompositorBridgePar.patch;patchdir=gecko-dev \
	file://sailfishos/0032-sailfishos-configure-Read-rustc-host-from-environmen.patch;patchdir=gecko-dev \
	file://sailfishos/0033-sailfishos-configure-Drop-thumbv7neon-and-thumbv7a-p.patch;patchdir=gecko-dev \
	file://sailfishos/0034-sailfishos-configure-Get-target-and-host-from-enviro.patch;patchdir=gecko-dev \
	file://sailfishos/0035-sailfishos-configure-Patch-libloading-to-build-on-ar.patch;patchdir=gecko-dev \
	file://sailfishos/0036-sailfishos-configure-Skip-min_libclang_version-test-.patch;patchdir=gecko-dev \
	file://sailfishos/0037-sailfishos-configure-Patch-glslopt-to-build-on-arm.patch;patchdir=gecko-dev \
	file://sailfishos/0038-sailfishos-embedlite-egl-Fix-mesa-egl-display-and-bu.patch;patchdir=gecko-dev \
	file://sailfishos/0039-sailfishos-egl-Do-not-create-CreateFallbackSurface.-.patch;patchdir=gecko-dev \
	file://sailfishos/0040-sailfishos-gecko-Fix-gfxPlatform-AsyncPanZoomEnabled.patch;patchdir=gecko-dev \
	file://sailfishos/0041-sailfishos-gecko-Avoid-incorrect-compiler-optimisati.patch;patchdir=gecko-dev \
	file://sailfishos/0042-sailfishos-gecko-Drop-static-casting-from-BrowserChi.patch;patchdir=gecko-dev \
	file://sailfishos/0043-sailfishos-docshell-Get-ContentFrameMessageManager-v.patch;patchdir=gecko-dev \
	file://sailfishos/0044-Revert-Bug-1445570-Remove-EnsureEventualAfterPaint-t.patch;patchdir=gecko-dev \
	file://sailfishos/0045-sailfishos-gecko-Prioritize-GMP-plugins-over-all-oth.patch;patchdir=gecko-dev \
	file://sailfishos/0046-sailfishos-gecko-Force-recycling-of-gmp-droid-instan.patch;patchdir=gecko-dev \
	file://sailfishos/0047-sailfishos-egl-Drop-swap_buffers_with_damage-extensi.patch;patchdir=gecko-dev \
	file://sailfishos/0048-Revert-Bug-1494175-Remove-unimplemented-nsIWebBrowse.patch;patchdir=gecko-dev \
	file://sailfishos/0049-sailfishos-gecko-Force-use-of-mobile-video-controls..patch;patchdir=gecko-dev \
	file://sailfishos/0050-sailfishos-gecko-Nullify-delayed-work-timer-after-ca.patch;patchdir=gecko-dev \
	file://sailfishos/0051-sailfishos-gecko-Workaround-for-late-access-message-.patch;patchdir=gecko-dev \
	file://sailfishos/0052-sailfishos-gecko-Limit-surface-area-rather-than-widt.patch;patchdir=gecko-dev \
	file://sailfishos/0053-sailfishos-gecko-Make-TextureImageEGL-hold-a-referen.patch;patchdir=gecko-dev \
	file://sailfishos/0054-sailfishos-gecko-Make-fullscreen-enabling-work-as-us.patch;patchdir=gecko-dev \
	file://sailfishos/0055-sailfishos-gecko-Embedlite-doesn-t-have-prompter-imp.patch;patchdir=gecko-dev \
	file://sailfishos/0056-sailfishos-gecko-Use-libcontentaction-for-custom-sch.patch;patchdir=gecko-dev \
	file://sailfishos/0057-sailfishos-gecko-Handle-temporary-directory-similarl.patch;patchdir=gecko-dev \
	file://sailfishos/0058-sailfishos-gecko-Disable-loading-heavier-extensions.patch;patchdir=gecko-dev \
	file://sailfishos/0059-sailfishos-gecko-Delete-startupCache-if-it-s-stale.patch;patchdir=gecko-dev \
	file://sailfishos/0060-sailfishos-gecko-Skip-invalid-WatchId-in-geolocation.patch;patchdir=gecko-dev \
	file://sailfishos/0061-sailfishos-locale-Get-12-24h-timeformat-setting-from.patch;patchdir=gecko-dev \
	file://sailfishos/0062-sailfishos-contentaction-Fix-content-action-integrat.patch;patchdir=gecko-dev \
	file://sailfishos/0063-sailfishos-gecko-Suppress-LoginManagerContent.jsm-ow.patch;patchdir=gecko-dev \
	file://sailfishos/0064-sailfishos-configuration-Configure-application-as-mo.patch;patchdir=gecko-dev \
	file://sailfishos/0065-sailfishos-gecko-Prioritize-loading-of-extension-ver.patch;patchdir=gecko-dev \
	file://sailfishos/0066-sailfishos-media-Ensure-audio-continues-when-screen-.patch;patchdir=gecko-dev \
	file://sailfishos/0067-sailfishos-gecko-Hardcode-loopback-address-for-profi.patch;patchdir=gecko-dev \
	file://sailfishos/0068-sailfishos-gecko-Start-using-user-agent-builder.-JB-.patch;patchdir=gecko-dev \
	file://sailfishos/0069-sailfishos-gecko-Hide-accessible-carets-also-with-to.patch;patchdir=gecko-dev \
	file://sailfishos/0070-sailfishos-gecko-Fix-flipped-FBO-textures-when-rende.patch;patchdir=gecko-dev \
	file://sailfishos/0071-sailfishos-gecko-Do-not-flip-scissor-rects-when-rend.patch;patchdir=gecko-dev \
	file://sailfishos/0072-sailfishos-components-Cleanup-static-components-defi.patch;patchdir=gecko-dev \
	file://sailfishos/0073-Revert-Bug-1611658-Unship-libcubeb-s-C-PulseAudio-ba.patch;patchdir=gecko-dev \
	file://sailfishos/0074-sailfishos-gfx-Use-scroll-frame-background-color-as-.patch;patchdir=gecko-dev \
	file://sailfishos/0075-sailfishos-gecko-Ignore-safemode-in-gfxPlatform.-Fix.patch;patchdir=gecko-dev \
	file://sailfishos/0076-sailfishos-docshell-Align-fix-parentprocess-checks.-.patch;patchdir=gecko-dev \
	file://sailfishos/0077-sailfishos-webrtc-Adapt-build-configuration-for-Sail.patch;patchdir=gecko-dev \
	file://sailfishos/0078-sailfishos-webrtc-Regenerate-moz.build-files.-JB-537.patch;patchdir=gecko-dev \
	file://sailfishos/0079-sailfishos-webrtc-Disable-desktop-sharing-feature-on.patch;patchdir=gecko-dev \
	file://sailfishos/0080-sailfishos-webrtc-Enable-GMP-for-encoding-decoding.-.patch;patchdir=gecko-dev \
	file://sailfishos/0081-sailfishos-webrtc-Implement-video-capture-module.-JB.patch;patchdir=gecko-dev \
	file://sailfishos/0082-sailfishos-gecko-Allow-LoginManagerPrompter-to-find-.patch;patchdir=gecko-dev \
	file://sailfishos/0083-sailfishos-gecko-dev-Disallow-page-zooming-if-the-me.patch;patchdir=gecko-dev \
	file://sailfishos/0084-sailfishos-gecko-Fix-audio-underruns-for-fullduplex-.patch;patchdir=gecko-dev \
	file://sailfishos/0085-sailfishos-gecko-dev-Fix-video-hardware-accelaration.patch;patchdir=gecko-dev \
	file://sailfishos/0086-sailfishos-gecko-Add-preference-to-bypass-CORS-on-ns.patch;patchdir=gecko-dev \
	file://sailfishos/0087-sailfishos-gecko-Fix-memory-reporting-of-wasm-memory.patch;patchdir=gecko-dev \
	file://sailfishos/0088-Revert-Bug-1611386-Drop-support-for-enable-system-sq.patch;patchdir=gecko-dev \
	file://sailfishos/0089-sailfishos-gecko-Add-a-video-decoder-based-on-gecko-.patch;patchdir=gecko-dev \
	file://sailfishos/0090-sailfishos-gecko-Disable-debug-info-for-rust.patch;patchdir=gecko-dev \
	file://sailfishos/0091-sailfishos-gecko-Initialise-SVGGeometryProperty-Reso.patch;patchdir=gecko-dev \
	file://sailfishos/0092-sailfishos-build-Add-support-for-aarch64-to-elfhack..patch;patchdir=gecko-dev \
	"

DEPENDS += "gtk+3 curl startup-notification libevent cairo libnotify \
            virtual/libgl pulseaudio icu dbus-glib \
            nodejs-native cbindgen-native \
            yasm-native nasm-native unzip-native \
            virtual/${TARGET_PREFIX}rust cargo-native ${RUSTLIB_DEP} \
           nspr nss"

SRCREV = "e43b88e274c39f5c84f436f09a9b24424c8d2338"

S = "${WORKDIR}/git/"

PV = "5.15.0+git${SRCPV}"

LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://gecko-dev/toolkit/content/license.html;endline=33;md5=b186c4b15b6099eac08a112f6243ee46"

inherit mozilla rust-common

TOOLCHAIN_pn-xulrunner-qt = "clang"
AS = "${CC}"

EXTRA_OECONF_remove = "--disable-static"

mozilla_run_mach_prepend() {
	echo build ${BUILD_SYS}
	echo target ${RUST_TARGET}
	export CROSS_COMPILE="${RUST_TARGET}"

	export QT_QPA_PLATFORM=minimal
	export HOST="${BUILD_SYS}"
	export TARGET="${RUST_TARGET}"
	export RUST_HOST_TARGET="${BUILD_SYS}"

	export SB2_TARGET="${RUST_TARGET}"
	export SB2_RUST_USE_REAL_EXECVP=Yes
	export SB2_RUST_USE_REAL_FN=Yes
	export SB2_RUST_TARGET_TRIPLE="${RUST_TARGET}"
}

do_configure_prepend() { 
	cd ${S}/gecko-dev
}
do_compile_prepend() { 
	cd ${S}/gecko-dev
}
