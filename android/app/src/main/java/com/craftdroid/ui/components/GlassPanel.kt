// android/app/src/main/java/com/craftdroid/ui/components/GlassPanel.kt
package com.craftdroid.ui.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun GlassPanel(content: @Composable () -> Unit) {
    Surface(color = Color(0x22FFFFFF)) {
        content()
    }
}