package com.example.jetpackcompose.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.core.setContent
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.model.Screen
import com.example.jetpackcompose.model.Status
import com.example.jetpackcompose.ui.home.HomeScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Crossfade(current = Status.currentScreen) { screen ->
                HomeScreen(screen)
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    ThemedPreview {
        HomeScreen(Screen.Home)
    }
}

