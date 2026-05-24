// android/app/src/main/java/com/craftdroid/ui/components/ResourceChart.kt
package com.craftdroid.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ResourceChart(label: String, value: String) {
    Text("$label: $value")
}