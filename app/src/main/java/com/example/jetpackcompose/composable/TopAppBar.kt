package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.IconButton
import androidx.ui.material.TopAppBar
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview
import com.example.jetpackcompose.ui.lightThemeColors


@Composable
fun Toolbar(
    openDrawer: () -> Unit
) {
    TopAppBar(
        title = { Text(text = "RailYatri") },
        color = lightThemeColors.primary,
        contentColor = Color.White,
        navigationIcon = {
            IconButton(
                onClick = openDrawer
            ) {
                Icon(
                    asset = vectorResource(R.drawable.ic_baseline_dehaze_24),
                    tint = Color.White
                )
            }
        },
        actions = {
            repeat(1) {
                IconButton(onClick = { }) {
                    Icon(
                        asset = vectorResource(R.drawable.ic_baseline_share_24),
                        tint = Color.White
                    )
                }
            }
        }
    )
}


@Preview("ToolAppBar")
@Composable
fun PreviewToolAppBar() {
    ThemedPreview {
        Toolbar {
        }
    }
}