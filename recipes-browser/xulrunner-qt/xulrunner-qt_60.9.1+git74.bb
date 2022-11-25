SRC_URI = "gitsm://github.com/sailfishos/gecko-dev.git;branch=sailfishos-esr60;protocol=https \
           file://sailfishos/0001-sailfishos-qt-Bring-back-Qt-layer.-JB-50505.patch \
           file://sailfishos/0002-sailfishos-gecko-Fix-embedlite-building.-JB-50505.patch \
           file://sailfishos/0003-sailfishos-gecko-Hackish-fix-for-preferences-usage-i.patch \
           file://sailfishos/0004-sailfishos-gecko-Hack-message_pump_qt-s-moc-generati.patch \
           file://sailfishos/0005-sailfishos-gecko-Backport-Embed-MessageLoop-contruct.patch \
           file://sailfishos/0006-sailfishos-compositor-Fix-GLContextProvider-defines.patch \
           file://sailfishos/0007-sailfishos-compositor-Make-it-possible-to-extend-Com.patch \
           file://sailfishos/0008-sailfishos-compositor-Allow-compositor-specializatio.patch \
           file://sailfishos/0009-sailfishos-gecko-Create-EmbedLiteCompositorBridgePar.patch \
           file://sailfishos/0010-sailfishos-gecko-Remove-PuppetWidget-from-TabChild-i.patch \
           file://sailfishos/0011-sailfishos-gecko-Make-TabChild-to-work-with-TabChild.patch \
           file://sailfishos/0012-sailfishos-build-Fix-build-error-with-newer-glibc.patch \
           file://sailfishos/0013-sailfishos-gecko-Enable-Pango-for-the-build.-JB-5086.patch \
           file://sailfishos/0014-sailfishos-gecko-Fix-gfxPlatform-AsyncPanZoomEnabled.patch \
           file://sailfishos/0015-sailfishos-gecko-Nullify-delayed-work-timer-after-ca.patch \
           file://sailfishos/0016-sailfishos-compositor-Respect-gfxPrefs-ClearCompoisi.patch \
           file://sailfishos/0017-sailfishos-gecko-Workaround-for-late-access-message-.patch \
           file://sailfishos/0018-sailfishos-gecko-Limit-surface-area-rather-than-widt.patch \
           file://sailfishos/0019-sailfishos-gecko-Make-TextureImageEGL-hold-a-referen.patch \
           file://sailfishos/0020-sailfishos-loginmanager-Adapt-LoginManager-to-EmbedL.patch \
           file://sailfishos/0021-sailfishos-gecko-Make-fullscreen-enabling-work-as-us.patch \
           file://sailfishos/0022-sailfishos-gecko-Embedlite-doesn-t-have-prompter-imp.patch \
           file://sailfishos/0023-sailfishos-gecko-Disable-Marionette.patch \
           file://sailfishos/0024-sailfishos-gecko-Use-libcontentaction-for-custom-sch.patch \
           file://sailfishos/0025-sailfishos-gecko-Handle-temporary-directory-similarl.patch \
           file://sailfishos/0026-sailfishos-gecko-Disable-loading-heavier-extensions.patch \
           file://sailfishos/0027-sailfishos-gecko-Avoid-incorrect-compiler-optimisati.patch \
           file://sailfishos/0028-sailfishos-gecko-Avoid-rogue-origin-points-when-clip.patch \
           file://sailfishos/0029-sailfishos-gecko-Allow-render-shaders-to-be-loaded-f.patch \
           file://sailfishos/0030-sailfishos-gecko-Prioritize-GMP-plugins-over-all-oth.patch \
           file://sailfishos/0031-sailfishos-gecko-Delete-startupCache-if-it-s-stale.patch \
           file://sailfishos/0032-sailfishos-mozglue-Introduce-EmbedInitGlue-to-the-mo.patch \
           file://sailfishos/0033-sailfishos-gecko-Skip-invalid-WatchId-in-geolocation.patch \
           file://sailfishos/0034-sailfishos-locale-Get-12-24h-timeformat-setting-from.patch \
           file://sailfishos/0035-sailfishos-contentaction-Fix-content-action-integrat.patch \
           file://sailfishos/0036-sailfishos-qt-Initialize-FreeType-library-properly.-.patch \
           file://sailfishos/0037-sailfishos-disable-TLS-1.0-and-1.1.patch \
           file://sailfishos/0038-sailfishos-gecko-Use-registered-IHistory-service-imp.patch \
           file://sailfishos/0039-sailfishos-gecko-Suppress-LoginManagerContent.jsm-ow.patch \
           file://sailfishos/0040-sailfishos-configuration-Configure-application-as-mo.patch \
           file://sailfishos/0041-sailfishos-gecko-Include-XUL-videocontrols-reflow-co.patch \
           file://sailfishos/0042-sailfishos-gecko-Adjust-audio-control-dimensions.-Co.patch \
           file://sailfishos/0043-sailfishos-gecko-Prioritize-loading-of-extension-ver.patch \
           file://sailfishos/0044-sailfishos-media-Ensure-audio-continues-when-screen-.patch \
           file://sailfishos/0045-sailfishos-backport--Make-MOZSIGNALTRAMPOLINE-Andro-.patch \
           file://sailfishos/0046-sailfishos-gecko-Force-recycling-of-gmpdroid-instanc.patch \
           file://sailfishos/0047-sailfishos-gecko-Hardcode-loopback-address-for-profi.patch \
           file://sailfishos/0048-sailfishos-backport-Enable-MOZ_GECKO_PROFILER-on-And.patch \
           file://sailfishos/0049-sailfishos-backport-Implement-DWARF-stack-walker-for.patch \
           file://sailfishos/0050-sailfishos-gecko-Make-button-hit-testing-similar-to-.patch \
           file://sailfishos/0051-sailfishos-gecko-Remove-android-define-from-logging.patch \
           file://sailfishos/0052-sailfishos-gecko-Change-behaviour-of-urlclassifier.s.patch \
           file://sailfishos/0053-sailfishos-gecko-Provide-checkbox-radio-renderer-for.patch \
           file://sailfishos/0054-sailfishos-gecko-Start-using-user-agent-builder.-JB-.patch \
           file://sailfishos/0055-sailfishos-gecko-Enable-event.srcElement-on-all-chan.patch \
           file://sailfishos/0056-sailfishos-gecko-Hide-accessible-carets-also-with-to.patch \
           file://sailfishos/0057-Bug-1449268-Treat-document-level-touch-event-listene.patch \
           file://sailfishos/0058-sailfishos-gecko-Log-bad-tex-upload-calls-and-errors.patch \
           file://sailfishos/0059-sailfishos-gecko-Ignore-safemode-in-gfxPlatform.-Fix.patch \
           file://sailfishos/0060-Bug-1467722-Don-t-return-null-for-getComputedStyle-w.patch \
           file://sailfishos/0061-Bug-1467722-Make-nsComputedDOMStyle-store-an-actual-.patch \
           file://sailfishos/0062-Bug-1467722-Do-not-throw-when-we-don-t-have-a-style-.patch \
           file://sailfishos/0063-sailfishos-fix-mesa-egl-display.patch \
           file://sailfishos/0064-sailfishos-gecko-Introduce-an-API-to-set-the-dynamic.patch \
           file://sailfishos/0065-Fix-flipped-FBO-textures-when-rendering-to-an-offscr.patch \
           file://sailfishos/0066-sailfishos-webrtc-Adapt-build-configuration-for-Sail.patch \
           file://sailfishos/0067-sailfishos-webrtc-Regenerate-moz.build-files.-JB-537.patch \
           file://sailfishos/0068-sailfishos-webrtc-Disable-desktop-sharing-feature-on.patch \
           file://sailfishos/0069-Do-not-flip-scissor-rects-when-rendering-to-an-offsc.patch \
           file://sailfishos/0070-sailfishos-webrtc-Enable-GMP-for-encoding.-JB-53982.patch \
           file://sailfishos/0071-sailfishos-webrtc-Implement-video-capture-module.-JB.patch \
           file://sailfishos/0072-sailfishos-gecko-Fix-audio-underruns-for-fullduplex-.patch \
           file://mozconfig \
           file://0001-Enable-to-specify-RUST_TARGET-via-enviroment-variabl.patch \
           file://0002-Add-RUSTSTDLIB-variable-to-configure.patch \
           file://0003-Avoid-using-autoconf2.13.patch \
           file://0004-fix-autoconf-pregenerated-old-configure.patch \
           file://0005-Remove-default-hidden-GCC-visibility.patch \
           "

DEPENDS += "gtk+3 curl startup-notification libevent cairo libnotify \
            virtual/libgl pulseaudio icu dbus-glib \
            nodejs-native cbindgen-native \
            yasm-native nasm-native unzip-native \
            virtual/${TARGET_PREFIX}rust cargo-native ${RUSTLIB_DEP} \
	    nspr-native nspr nss-native nss \
	    qtdeclarative qtbase-native libproxy dconf"

SRCREV = "sailfishos/60.9.1+git74"

S = "${WORKDIR}/git/"

LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://toolkit/content/license.html;endline=33;md5=f51d0fbc370c551d7371775b4f6544ca"

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

