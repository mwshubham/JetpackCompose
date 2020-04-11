package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.IconButton
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Notifications
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
        title = { Text(text = "Travel App") },
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
            IconButton(onClick = { }) {
                Icon(
                    asset = Icons.Filled.Notifications,
                    tint = Color.White
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    asset = vectorResource(id = R.drawable.ic_baseline_local_offer_24),
                    tint = Color.White
                )
            }

            IconButton(onClick = { }) {
                Icon(
                    asset = vectorResource(id = R.drawable.ic_baseline_language_24),
                    tint = Color.White
                )
            }
        }
    )
}


@Preview("TopAppBar")
@Composable
fun PreviewToolAppBar() {
    ThemedPreview {
        Toolbar {
        }
    }
}