package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.foundation.Icon
import androidx.ui.material.FloatingActionButton
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview


/**
 * @see [https://joebirch.co/android/exploring-jetpack-compose-floating-action-button/]
 */
@Composable
fun FloatingActionButtonComponent() {
    FloatingActionButton(onClick = {}) {
        Icon(
            asset = vectorResource(R.drawable.ic_baseline_share_24)
        )
    }
}


@Preview("FloatingActionButtonComponent")
@Composable
fun PreviewFloatingActionButtonComponent() {
    ThemedPreview {
        FloatingActionButtonComponent()
    }
}