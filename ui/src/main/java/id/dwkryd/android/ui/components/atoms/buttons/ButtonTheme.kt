package io.dwikiriyadi.android.ui.components.atoms.buttons


// TODO: temporary need to change
sealed class ButtonTheme(open val elevation: Int = 0) {
    data class Elevated(override val elevation: Int = 0) : ButtonTheme(elevation)
    data class Outlined(override val elevation: Int = 0) : ButtonTheme(elevation)
    data class Text(override val elevation: Int = 0) : ButtonTheme(elevation)
}
