package app.kirklandpickles.gboardofflinevoice

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

private const val GBOARD_PACKAGE = "com.google.android.inputmethod.latin"

internal val GBOARD = Compatibility(
    name = "Gboard",
    packageName = GBOARD_PACKAGE,
    apkFileType = ApkFileType.APKM,
    appIconColor = 0x1A73E8,
    targets = listOf(
        AppTarget(version = "18.2.4.969776716-release-arm64-v8a"),
        AppTarget(version = "18.2.4.969776716-release-armeabi-v7a"),
        AppTarget(version = "18.2.4.969776716-release-x86"),
        AppTarget(version = "18.2.4.969776716-release-x86_64"),
        AppTarget(version = null, isExperimental = true),
    ),
)

