// android/app/src/main/java/com/craftdroid/ui/theme/Theme.kt
package com.craftdroid.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun CraftDroidTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = androidx.compose.material3.darkColorScheme(
            background = Background,
            surface = BackgroundAlt,
            primary = Accent,
            secondary = Accent2,
            onBackground = TextPrimary,
            onSurface = TextPrimary
        ),
        typography = CraftTypography,
        shapes = CraftShapes,
        content = content
    )
}