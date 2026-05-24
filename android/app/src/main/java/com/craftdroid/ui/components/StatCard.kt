// android/app/src/main/java/com/craftdroid/ui/components/StatCard.kt
package com.craftdroid.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatCard(title: String, value: String) {
    Card {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title)
            Text(value)
        }
    }
}