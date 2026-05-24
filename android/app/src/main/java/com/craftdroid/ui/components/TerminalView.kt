// android/app/src/main/java/com/craftdroid/ui/components/TerminalView.kt
package com.craftdroid.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TerminalView(lines: List<String>) {
    Text(lines.joinToString("\n"))
}