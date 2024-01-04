package com.abyxcz.mad_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SecondaryScreen(
    onNavigateToMain : () -> Unit,
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF00AAAA))
    ) {

        Button(
            onClick = { onNavigateToMain() },
            content = {
                Greeting(name = "Secondary Screen")
            }
        )
    }

}