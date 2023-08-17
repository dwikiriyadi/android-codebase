package id.dwkryd.android.ui

import id.dwkryd.android.ui.components.atoms.buttons.ButtonTheme

data class ThemeData(
    val elevatedButtonTheme: ButtonTheme.Elevated = ButtonTheme.Elevated(),
)

//val LocalThemeData = staticCompositionLocalOf { ThemeData() }