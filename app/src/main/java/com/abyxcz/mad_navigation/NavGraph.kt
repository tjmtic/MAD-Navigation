package com.abyxcz.mad_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {

        composable(route = Screen.Main.route) {
            MainScreen(onNavigateToSecondary = { navController.navigate(route = Screen.Secondary.route)})
        }

        composable(route = Screen.Secondary.route) {
            SecondaryScreen(onNavigateToMain = { navController.navigate(route = Screen.Main.route)})
        }

    }
}