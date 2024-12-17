package com.doganur.bootcamphomework5.main.navigation

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home_screen")
    data object AppleScreen : Screen("apple_screen")
    data object BananaScreen : Screen("banana_screen")
    data object CherryScreen : Screen("cherry_screen")
    data object MelonScreen : Screen("melon_screen")
}