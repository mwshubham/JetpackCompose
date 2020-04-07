package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.ThemedPreview


/**
 * @see [https://proandroiddev.com/how-to-make-a-recyclerview-in-jetpack-compose-fd54417d8479]
 */
@Composable
fun VerticalScrollerComponent(
    modifier: Modifier = Modifier.None
) {
    VerticalScroller(
        modifier = modifier
    ) {
        Column {
            repeat(500) {
                Text(
                    text = "#$it Hello World ! "
                )
            }
        }
    }
}


@Preview("VerticalScroller")
@Composable
fun PreviewVerticalScrollerComponent() {
    ThemedPreview {
        VerticalScrollerComponent()
    }
}