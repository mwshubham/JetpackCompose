package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.material.Button
import androidx.ui.material.TextButton
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.ThemedPreview

@Preview("Button")
@Composable
fun PreviewButton() {
    ThemedPreview {
        Button(onClick = {}) {
            Text(text = "Hello World !")
        }
    }
}


@Preview("TextButton")
@Composable
fun PreviewTextButton() {
    ThemedPreview {
        TextButton(onClick = {}) {
            Text(text = "Hello World !")
        }
    }
}
