package com.abyxcz.mad_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavDeepLink
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main_screen"
    ) {

        composable(route = "main_screen") {
            MainScreen(onNavigateToSecondary = { })
        }

    }
}