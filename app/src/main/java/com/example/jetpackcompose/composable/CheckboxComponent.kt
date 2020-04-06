package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.material.Checkbox
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.model.FormState
import com.example.jetpackcompose.ui.ThemedPreview

/**
 * @see [https://joebirch.co/android/exploring-jetpack-compose-checkbox/]
 */
@Composable
fun CheckboxComponent(
    modifier: Modifier = Modifier.None,
    formState: FormState
) {
    Checkbox(
        checked = formState.checked,
        onCheckedChange = { checked ->
            formState.checked = checked
        },
        modifier = modifier
    )
}


@Preview("CheckboxComponent")
@Composable
fun PreviewCheckboxComponent() {
    ThemedPreview {
        CheckboxComponent(formState = FormState(checked = true))
    }
}