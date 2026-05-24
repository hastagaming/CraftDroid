package com.craftdroid.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.craftdroid.ui.navigation.NavGraph

@Composable
fun App() {
    val navController = rememberNavController()

    MaterialTheme {
        Surface {
            NavGraph(navController)
        }
    }
}