package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.padding
import androidx.ui.material.TopAppBar
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview
import com.example.jetpackcompose.ui.lightThemeColors

@Composable
fun Toolbar(
    openDrawer: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = "RailYatri"
            )
        },
        color = lightThemeColors.primary,
        contentColor = Color.White,
        navigationIcon = {
            Clickable(onClick = openDrawer) {
                Icon(
                    asset = vectorResource(R.drawable.ic_baseline_dehaze_24),
                    modifier = Modifier.padding(start = 16.dp),
                    tint = Color.White
                )
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