package com.abyxcz.mad_navigation

sealed class Screen(val route: String) {
    object Main : Screen("main_screen")
    object Secondary : Screen("secondary_screen")
}