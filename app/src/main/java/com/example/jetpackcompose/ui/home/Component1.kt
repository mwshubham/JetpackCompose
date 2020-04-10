package com.example.jetpackcompose.ui.home

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.tag
import androidx.ui.foundation.Box
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.ConstraintLayout
import androidx.ui.layout.ConstraintSet
import androidx.ui.layout.RowScope.weight
import androidx.ui.layout.padding
import androidx.ui.layout.preferredSize
import androidx.ui.material.Surface
import androidx.ui.res.colorResource
import androidx.ui.res.vectorResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview

val headerTexts = mutableListOf<String>().apply {
    add("Book")
    add("New")
    add("New")
}
val icons = mutableListOf<Int>().apply {
    add(R.drawable.ic_baseline_directions_bus_36)
    add(R.drawable.ic_baseline_train_36)
    add(R.drawable.ic_baseline_fastfood_36)
}
val footerTexts = mutableListOf<String>().apply {
    add("intrcity")
    add("IRCTC")
    add("Hygenic")
}
val labelTexts = mutableListOf<String>().apply {
    add("Smart Buses")
    add("Train Tickets")
    add("Food on Trains")
}

@Composable
fun Component1(
    modifier: Modifier = Modifier.None,
    headerText: String,
    icon: Int,
    footerText: String,
    labelText: String
) {
    ConstraintLayout(
        modifier = modifier,
        constraintSet = ConstraintSet {
            val header = tag("header")
            val image = tag("image")
            val footer = tag("footer")
            val label = tag("label")

            header.apply {
                top constrainTo image.top
                bottom constrainTo image.top
                left constrainTo parent.left
                right constrainTo parent.right
            }
            image.apply {
                centerHorizontally()
                left constrainTo parent.left
                right constrainTo parent.right
            }
            footer.apply {
                top constrainTo image.bottom
                left constrainTo parent.left
                right constrainTo parent.right
                top.margin = 6.dp
            }

            label.apply {
                top constrainTo footer.bottom
                left constrainTo parent.left
                right constrainTo parent.right
            }

        }) {
        Box(
            modifier = Modifier.tag("image")
                    + Modifier.preferredSize(64.dp),
            padding = 4.dp,
            backgroundColor = Color.White,
            shape = CircleShape
        ) {
            Icon(
                modifier = Modifier.preferredSize(64.dp),
                asset = vectorResource(id = icon),
                tint = colorResource(id = R.color.colorComponent1ImageTint)
            )
        }

        Surface(
            color = colorResource(id = R.color.colorComponent1HeaderBackground),
            modifier = Modifier.tag("header"),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = headerText,
                modifier = Modifier.padding(8.dp, 2.dp, 8.dp, 2.dp),
                style = TextStyle(
                    fontSize = 8.sp
                )
            )
        }
        Surface(
            color = colorResource(id = R.color.colorComponent1FooterBackground),
            modifier = Modifier.tag("footer"),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = footerText,
                modifier = Modifier.padding(8.dp, 2.dp, 8.dp, 2.dp),
                style = TextStyle(
                    fontSize = 8.sp,
                    color = Color.White
                )
            )
        }

        Text(
            text = labelText,
            modifier = Modifier.tag("label"),
            style = TextStyle(
                color = Color.White
            )
        )
    }

}


@Preview("Component1")
@Composable
fun Component1Preview() {
    ThemedPreview {
        Component1(
            modifier = Modifier.weight(1f),
            headerText = headerTexts[0],
            icon = icons[0],
            footerText = footerTexts[0],
            labelText = labelTexts[0]
        )
    }
}

