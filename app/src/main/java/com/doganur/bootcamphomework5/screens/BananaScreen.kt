package com.doganur.bootcamphomework5.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.doganur.bootcamphomework5.R
import com.doganur.bootcamphomework5.main.navigation.Screen
import com.doganur.bootcamphomework5.ui.theme.PrimaryColor
import com.doganur.bootcamphomework5.ui.theme.TextColor
import com.doganur.bootcamphomework5.ui.theme.WhiteColor

@Composable
fun BananaScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Now Banana Screen",
            color = TextColor,
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )

        Icon(
            modifier = Modifier,
            painter = painterResource(id = R.drawable.ic_banana),
            contentDescription = "Banana Screen Icon",
            tint = Color.Yellow
        )

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryColor,
                contentColor = WhiteColor
            ),
            shape = RoundedCornerShape(16.dp),
            onClick = {
                navController.navigate(Screen.MelonScreen.route)
            }
        ) {
            Text(
                text = "Go Melon Screen",
                color = WhiteColor
            )
        }
    }
}