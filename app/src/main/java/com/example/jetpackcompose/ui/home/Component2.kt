package com.example.jetpackcompose.ui.home

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Border
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.TextField
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.OutlinedButton
import androidx.ui.material.Surface
import androidx.ui.res.colorResource
import androidx.ui.res.vectorResource
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview


@Composable
fun Component2() {

    Column(
        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            arrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "From",
                modifier = Modifier.weight(1f) + Modifier.padding(end = 8.dp),
                style = TextStyle(
                    textAlign = TextAlign.Start,
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.colorComponent2HintText)
                )
            )
            Text(
                text = "To",
                modifier = Modifier.weight(1f) + Modifier.padding(start = 8.dp),
                style = TextStyle(
                    textAlign = TextAlign.End,
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.colorComponent2HintText)
                )
            )
        }
        Row {
            Column(
                modifier = Modifier.weight(1f)
                        + Modifier.padding(end = 8.dp)
                        + Modifier.wrapContentHeight()
            ) {
                var textValue1 by state { "Delhi" }
                TextField(
                    value = textValue1,
                    onValueChange = {
                        textValue1 = it
                    },
                    textStyle = TextStyle(
                        fontWeight = FontWeight.W500,
                        textAlign = TextAlign.Start,
//                        textDecoration = TextDecoration.Underline,
                        fontSize = 16.sp
                    )
                )
                Divider(color = colorResource(id = R.color.colorDivider))
            }

            Icon(
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                asset = vectorResource(id = R.drawable.ic_baseline_swap_horiz_24),
                tint = colorResource(id = R.color.colorComponent2SwapImageTint)
            )

            Column(
                modifier = Modifier.weight(1f)
                        + Modifier.padding(start = 8.dp)
                        + Modifier.wrapContentHeight()
            ) {
                var textValue2 by state { "Chandigarh" }
                TextField(
                    value = textValue2,
                    onValueChange = {
                        textValue2 = it
                    },
                    textStyle = TextStyle(
                        fontWeight = FontWeight.W500,
                        textAlign = TextAlign.End,
//                        textDecoration = TextDecoration.Underline,
                        fontSize = 16.sp
                    )
                )
                Divider(color = colorResource(id = R.color.colorDivider))
            }
        }

        Text(
            text = "Date",
            modifier = Modifier.padding(top = 24.dp),
            style = TextStyle(
                fontSize = 12.sp,
                color = colorResource(id = R.color.colorComponent2HintText)
            )
        )

        Row(
            modifier = Modifier.fillMaxWidth()
                    + Modifier.wrapContentHeight()
                    + Modifier.padding(top = 8.dp),
            arrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.wrapContentSize()
            ) {
                Icon(
                    asset = vectorResource(id = R.drawable.ic_baseline_calendar_today_24),
                    tint = colorResource(id = R.color.colorComponent2CalendarImageTint)
                )
                Text(
                    text = "10",
                    modifier = Modifier.padding(start = 8.dp) + Modifier.gravity(RowAlign.Center),
                    style = TextStyle(
                        fontWeight = FontWeight.W500,
                        fontSize = 18.sp
                    )
                )
                Text(
                    text = "Apr, Fri",
                    modifier = Modifier.padding(start = 6.dp) + Modifier.gravity(RowAlign.Center),
                    style = TextStyle(
                        fontWeight = FontWeight.W500,
                        fontSize = 12.sp
                    )
                )

            }

            Row(
                modifier = Modifier.wrapContentWidth() + Modifier.gravity(RowAlign.Center)
            ) {
                Surface(
                    border = Border(
                        size = 1.dp,
                        color = colorResource(id = R.color.colorComponent2DateOutline)
                    ),
                    color = Color.Transparent,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.padding(end = 6.dp)
                ) {
                    Text(
                        text = "11 Apr",
                        modifier = Modifier.padding(8.dp, 4.dp, 8.dp, 4.dp),
                        style = TextStyle(
                            fontSize = 12.sp
                        )
                    )
                }
                Surface(
                    border = Border(
                        size = 1.dp,
                        color = colorResource(id = R.color.colorComponent2DateOutline)
                    ),
                    color = Color.Transparent,
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "12 Apr",
                        modifier = Modifier.padding(8.dp, 4.dp, 8.dp, 4.dp),
                        style = TextStyle(
                            fontSize = 12.sp
                        )
                    )
                }

            }
        }

        Divider(
            modifier = Modifier.padding(top = 8.dp),
            color = colorResource(id = R.color.colorDivider)
        )

        Row(
            modifier = Modifier.fillMaxWidth() + Modifier.padding(top = 8.dp)
        ) {
            OutlinedButton(
                onClick = {},
                backgroundColor = Color.Transparent,
                modifier = Modifier.weight(1f) + Modifier.padding(end = 8.dp),
                innerPadding = EdgeInsets(
                    left = 10.dp,
                    top = 6.dp,
                    bottom = 6.dp,
                    right = 10.dp
                ),
                border = Border(
                    size = 1.dp,
                    color = colorResource(id = R.color.colorComponent2ButtonOutline)
                )
            ) {
                Row {
                    Icon(
                        asset = vectorResource(id = R.drawable.ic_baseline_directions_bus_24),
                        tint = colorResource(id = R.color.colorComponent2ButtonIconTint)
                    )
                    Text(
                        text = "Search Buses",
                        modifier = Modifier.padding(start = 2.dp) + Modifier.gravity(RowAlign.Center),
                        style = TextStyle(
//                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.colorComponent2ButtonText)
                        )
                    )
                }
            }

            OutlinedButton(
                onClick = {},
                backgroundColor = Color.Transparent,
                modifier = Modifier.weight(1f) + Modifier.padding(start = 8.dp),
                innerPadding = EdgeInsets(
                    left = 10.dp,
                    top = 6.dp,
                    bottom = 6.dp,
                    right = 10.dp
                ),
                border = Border(
                    size = 1.dp,
                    color = colorResource(id = R.color.colorComponent2ButtonOutline)
                )
            ) {

                Row {
                    Icon(
                        asset = vectorResource(id = R.drawable.ic_baseline_train_24),
                        tint = colorResource(id = R.color.colorComponent2ButtonIconTint)
                    )
                    Text(
                        text = "Search Trains",
                        modifier = Modifier.padding(start = 2.dp) + Modifier.gravity(RowAlign.Center),
                        style = TextStyle(
//                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.colorComponent2ButtonText)
                        )
                    )
                }
            }
        }

    }
}


@Preview("Component2Preview")
@Composable
fun Component2Preview() {
    ThemedPreview {
        Component2()
    }
}