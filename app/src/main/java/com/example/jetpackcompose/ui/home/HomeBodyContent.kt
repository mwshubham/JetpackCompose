package com.example.jetpackcompose.ui.home

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.layout.fillMaxSize
import androidx.ui.material.Surface

@Composable
fun HomeBodyContent(modifier: Modifier) {
    Surface(modifier = modifier.plus(Modifier.fillMaxSize())) {
        //        CheckboxComponent(modifier = modifier, formState = FormState(checked = true))
        //        VerticalScrollerComponent()
    }
}
