package com.craftdroid.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.craftdroid.ui.navigation.Routes

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF050816),
                        Color(0xFF0A0F29)
                    )
                )
            )
            .padding(20.dp)
    ) {

        Text(
            text = "CraftDroid",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Minecraft Runtime Platform",
            color = Color.Gray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {
                navController.navigate(Routes.CREATE_SERVER)
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF00C2FF)
            )
        ) {
            Text("Create Server")
        }

        Spacer(modifier = Modifier.height(24.dp))

        ServerCard(
            name = "Survival SMP",
            engine = "PocketMine-MP",
            status = "ONLINE"
        )

        Spacer(modifier = Modifier.height(16.dp))

        ServerCard(
            name = "Lifesteal",
            engine = "Paper + Geyser",
            status = "OFFLINE"
        )
    }
}

@Composable
fun ServerCard(
    name: String,
    engine: String,
    status: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0x221FFFFFF)
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column {
                Text(
                    text = name,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = engine,
                    color = Color.Gray
                )
            }

            Text(
                text = status,
                color = if (status == "ONLINE") {
                    Color.Green
                } else {
                    Color.Red
                }
            )
        }
    }
}