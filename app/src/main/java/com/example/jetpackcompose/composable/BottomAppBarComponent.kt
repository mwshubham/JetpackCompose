package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Shape
import androidx.ui.material.BottomAppBar
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.ThemedPreview
import com.example.jetpackcompose.ui.lightThemeColors


/**
 * @see [https://proandroiddev.com/creating-appbars-in-jetpack-compose-a8b5a5639930]
 */
@Composable
fun BottomAppBarComponent(
    fabConfiguration: BottomAppBar.FabConfiguration? = null,
    cutoutShape: Shape
) {
    BottomAppBar(
        color = lightThemeColors.primary,
        fabConfiguration = fabConfiguration,
        cutoutShape = cutoutShape
    ) {

    }
}


@Preview("BottomAppBarComponent")
@Composable
fun PreviewBottomAppBarComponent() {
    ThemedPreview {
        BottomAppBarComponent(
            cutoutShape = CircleShape
        )
    }
}