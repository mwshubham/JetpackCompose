package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.IconButton
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview
import com.example.jetpackcompose.ui.lightThemeColors


/**
 * @see [https://joebirch.co/android/exploring-jetpack-compose-floating-action-button/]
 */
@Composable
fun FloatingActionButtonComponent(
    shape: Shape
) {
    FloatingActionButton(
        backgroundColor = lightThemeColors.primary,
        contentColor = Color.White,
        shape = shape,
        onClick = {}
    ) {
        IconButton(onClick = {}) {
            Icon(
                asset = vectorResource(R.drawable.ic_baseline_train_24),
                tint = Color.White
            )
        }
    }
}


@Preview("FloatingActionButtonComponent")
@Composable
fun PreviewFloatingActionButtonComponent() {
    ThemedPreview {
        FloatingActionButtonComponent(CircleShape)
    }
}