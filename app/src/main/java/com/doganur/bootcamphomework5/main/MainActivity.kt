package com.doganur.bootcamphomework5.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.doganur.bootcamphomework5.main.navigation.bottom_navigation.BottomBarScreen
import com.doganur.bootcamphomework5.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                BottomBarScreen()
            }
        }
    }
}