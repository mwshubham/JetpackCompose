package com.example.jetpackcompose.composable

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.Surface
import androidx.ui.material.TextButton
import androidx.ui.res.vectorResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview
import com.example.jetpackcompose.ui.lightThemeColors
import com.example.jetpackcompose.ui.themeTypography

@Composable
fun DrawerButton(
    modifier: Modifier = Modifier.None,
    @DrawableRes icon: Int,
    label: String,
    isSelected: Boolean,
    action: () -> Unit
) {

    val backgroundColor = if (isSelected) {
        lightThemeColors.primary.copy(alpha = 0.12f)
    } else {
        lightThemeColors.surface
    }

    val surfaceModifier = modifier +
            Modifier.padding(
                start = 16.dp,
                top = 8.dp,
                end = 0.dp,
                bottom = 0.dp
            ) + Modifier.fillMaxWidth()

    Surface(
        modifier = surfaceModifier,
        color = backgroundColor,
        shape = RoundedCornerShape(
            topLeft = 8.dp,
            topRight = 0.dp,
            bottomRight = 0.dp,
            bottomLeft = 8.dp
        )
    ) {
        val textIconColor = if (isSelected) {
            lightThemeColors.primary
        } else {
            lightThemeColors.onSurface.copy(alpha = 0.6f)
        }

        TextButton(
            onClick = action
        ) {
            Row(arrangement = Arrangement.Start) {
                Icon(
                    asset = vectorResource(icon),
                    tint = textIconColor
                )
                Spacer(Modifier.preferredSize(16.dp))
                Text(
                    text = label,
                    style = themeTypography.body2.copy(
                        color = textIconColor
                    )
                )
            }
        }
    }
}

@Preview("DrawerButton")
@Composable
fun PreviewDrawerButton() {
    ThemedPreview {
        DrawerButton(
            icon = R.drawable.ic_baseline_home_24,
            label = "Home",
            isSelected = true
        ) {
        }
    }
}
