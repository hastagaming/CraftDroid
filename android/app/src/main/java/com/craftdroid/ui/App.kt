package com.craftdroid.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.craftdroid.ui.navigation.NavGraph

@Composable
fun App() {
    MaterialTheme {
        Surface {
            NavGraph()
        }
    }
}