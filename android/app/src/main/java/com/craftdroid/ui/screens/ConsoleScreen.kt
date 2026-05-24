package com.craftdroid.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ConsoleScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {

        Text(
            text = "[INFO] Starting PocketMine-MP",
            color = Color.Green,
            fontFamily = FontFamily.Monospace
        )

        Text(
            text = "[INFO] Loading plugins...",
            color = Color.White,
            fontFamily = FontFamily.Monospace
        )

        Text(
            text = "[INFO] Server started successfully",
            color = Color.Cyan,
            fontFamily = FontFamily.Monospace
        )
    }
}