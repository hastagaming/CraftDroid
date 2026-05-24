// android/app/src/main/java/com/craftdroid/ui/components/ServerCard.kt
package com.craftdroid.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ServerCard(name: String, engine: String, status: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0x221FFFFFF))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(name)
            Text(engine)
            Text(status)
        }
    }
}