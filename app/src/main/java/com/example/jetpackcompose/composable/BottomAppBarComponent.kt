package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Row
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.BottomAppBar
import androidx.ui.material.IconButton
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Home
import androidx.ui.material.icons.filled.Person
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
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

        RowAddSpaceBetweenViewsComponent {
            IconButton(onClick = { }) {
                Icon(
                    asset = Icons.Filled.Home,
                    tint = Color.White
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    asset = Icons.Filled.Person,
                    tint = Color.White
                )
            }
        }
    }
}


@Composable
fun RowAddSpaceBetweenViewsComponent(children: @Composable() () -> Unit) {
    // Row is a composable that places its children in a horizontal sequence. You can think of it
    // similar to a LinearLayout with the horizontal orientation. In addition, we pass a modifier
    // to the Row composable. You can think of Modifiers as implementations of the decorators
    // pattern that are used to modify the composable that its applied to. In this example, we
    // assign add a modifier to the Row and ask it to extend the full width available to it.
    // We use Arrangement.SpaceBetween to place the children of the row such that they are spaced
    // evenly across the main axis, without free space before the first child or after the last child.
    Row(
        modifier = Modifier.fillMaxWidth() + Modifier.padding(4.dp), arrangement = Arrangement
            .SpaceBetween
    ) {
        children()
    }
}

@Preview("Child view with auto space in between arrangement")
@Composable
fun RowAddSpaceBetweenViewsComponentPreview() {
    RowAddSpaceBetweenViewsComponent {
        IconButton(onClick = { }) {
            Icon(
                asset = Icons.Filled.Home,
                tint = Color.White
            )
        }
        IconButton(onClick = { }) {
            Icon(
                asset = Icons.Filled.Person,
                tint = Color.White
            )
        }
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