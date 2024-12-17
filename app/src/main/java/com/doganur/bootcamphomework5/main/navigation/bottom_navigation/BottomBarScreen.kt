package com.doganur.bootcamphomework5.main.navigation.bottom_navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.doganur.bootcamphomework5.R
import com.doganur.bootcamphomework5.main.navigation.AppNavigation
import com.doganur.bootcamphomework5.main.navigation.Screen

@Composable
fun BottomBarScreen() {

    val navController = rememberNavController()
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(
                    selected = currentDestination == Screen.AppleScreen.route,
                    onClick = { navController.navigate(Screen.AppleScreen.route) },
                    label = { Text(text = "Apple") },
                    icon = {
                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(id = R.drawable.ic_apple),
                            contentDescription = "Apple",
                            tint = Color.Red
                        )
                    }
                )

                NavigationBarItem(
                    selected = currentDestination == Screen.BananaScreen.route,
                    onClick = { navController.navigate(Screen.BananaScreen.route) },
                    label = { Text(text = "Banana") },
                    icon = {
                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(id = R.drawable.ic_banana),
                            contentDescription = "Banana",
                            tint = Color.Yellow
                        )
                    }
                )

                NavigationBarItem(
                    selected = currentDestination == Screen.HomeScreen.route,
                    onClick = { navController.navigate(Screen.HomeScreen.route) },
                    label = { Text(text = "Home") },
                    icon = {
                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = "Home",
                            tint = Color.Green
                        )
                    }
                )

                NavigationBarItem(
                    selected = currentDestination == Screen.CherryScreen.route,
                    onClick = { navController.navigate(Screen.CherryScreen.route) },
                    label = { Text(text = "Cherry") },
                    icon = {
                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(id = R.drawable.ic_cherry),
                            contentDescription = "Cherry",
                            tint = Color.Magenta
                        )
                    }
                )

                NavigationBarItem(
                    selected = currentDestination == Screen.MelonScreen.route,
                    onClick = { navController.navigate(Screen.MelonScreen.route) },
                    label = { Text(text = "Melon") },
                    icon = {
                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(id = R.drawable.ic_melon),
                            contentDescription = "Melon",
                            tint = Color.Green
                        )
                    }
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            AppNavigation(
                navController = navController,
                startDestination = Screen.HomeScreen.route
            )
        }
    }
}
