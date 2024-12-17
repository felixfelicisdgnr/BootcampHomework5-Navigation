package com.doganur.bootcamphomework5.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.doganur.bootcamphomework5.screens.AppleScreen
import com.doganur.bootcamphomework5.screens.BananaScreen
import com.doganur.bootcamphomework5.screens.CheeryScreen
import com.doganur.bootcamphomework5.screens.HomeScreen
import com.doganur.bootcamphomework5.screens.MelonScreen

@Composable
fun AppNavigation(
    startDestination: String,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(
                navController = navController
            )
        }

        composable(
            route = Screen.AppleScreen.route
        ) {
            AppleScreen(
                navController = navController
            )
        }

        composable(
            route = Screen.BananaScreen.route
        ) {
            BananaScreen(
                navController = navController
            )
        }

        composable(
            route = Screen.CherryScreen.route
        ) {
            CheeryScreen(
                navController = navController
            )
        }

        composable(
            route = Screen.MelonScreen.route
        ) {
            MelonScreen(
                navController = navController
            )
        }
    }
}