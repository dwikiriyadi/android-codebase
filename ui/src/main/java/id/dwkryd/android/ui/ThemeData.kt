package io.dwikiriyadi.android.ui

import io.dwikiriyadi.android.ui.components.atoms.buttons.ButtonTheme

data class ThemeData(
    val elevatedButtonTheme: ButtonTheme.Elevated = ButtonTheme.Elevated(),
)

//val LocalThemeData = staticCompositionLocalOf { ThemeData() }