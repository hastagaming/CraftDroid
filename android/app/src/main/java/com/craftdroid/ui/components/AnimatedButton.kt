// android/app/src/main/java/com/craftdroid/ui/components/AnimatedButton.kt
package com.craftdroid.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun AnimatedButton(text: String, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text(text)
    }
}