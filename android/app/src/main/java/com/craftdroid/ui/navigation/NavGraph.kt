package com.craftdroid.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.craftdroid.ui.screens.ConsoleScreen
import com.craftdroid.ui.screens.CreateServerScreen
import com.craftdroid.ui.screens.DashboardScreen
import com.craftdroid.ui.screens.HomeScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {

        composable(Routes.HOME) {
            HomeScreen(navController)
        }

        composable(Routes.CREATE_SERVER) {
            CreateServerScreen(navController)
        }

        composable(Routes.DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(Routes.CONSOLE) {
            ConsoleScreen(navController)
        }
    }
}