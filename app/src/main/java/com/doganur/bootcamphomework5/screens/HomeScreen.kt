package com.doganur.bootcamphomework5.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.doganur.bootcamphomework5.main.navigation.Screen
import com.doganur.bootcamphomework5.ui.theme.PrimaryColor
import com.doganur.bootcamphomework5.ui.theme.WhiteColor

@Composable
fun HomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryColor,
                contentColor = WhiteColor
            ),
            shape = RoundedCornerShape(8.dp),
            onClick = {
                navController.navigate(Screen.AppleScreen.route)
            }
        ) {
            Text(
                text = "Go Apple Screen",
                color = WhiteColor
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryColor,
                contentColor = WhiteColor
            ),
            shape = RoundedCornerShape(8.dp),
            onClick = {
                navController.navigate(Screen.BananaScreen.route)
            }
        ) {
            Text(
                text = "Go Banana Screen",
                color = WhiteColor
            )
        }
    }
}
