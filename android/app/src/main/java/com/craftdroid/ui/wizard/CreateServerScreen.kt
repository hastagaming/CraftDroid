package com.craftdroid.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CreateServerScreen(navController: NavHostController) {

    val selectedEdition = remember {
        mutableStateOf("bedrock")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF050816))
            .padding(20.dp)
    ) {

        Text(
            text = "Create Server",
            color = Color.White,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(24.dp))

        EditionCard(
            title = "Minecraft Bedrock",
            description = "PocketMine, Nukkit, Official",
            selected = selectedEdition.value == "bedrock"
        ) {
            selectedEdition.value = "bedrock"
        }

        Spacer(modifier = Modifier.height(16.dp))

        EditionCard(
            title = "Minecraft Java",
            description = "Paper, Purpur, Fabric",
            selected = selectedEdition.value == "java"
        ) {
            selectedEdition.value = "java"
        }
    }
}

@Composable
fun EditionCard(
    title: String,
    description: String,
    selected: Boolean,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            },
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selected) {
                Color(0xFF00C2FF)
            } else {
                Color(0x221FFFFFF)
            }
        )
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Text(
                text = title,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = description,
                color = Color.LightGray
            )
        }
    }
}