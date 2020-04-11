package com.example.jetpackcompose.ui.home

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.BottomNavigation
import androidx.ui.material.BottomNavigationItem
import androidx.ui.material.Card
import androidx.ui.material.Surface
import androidx.ui.res.colorResource
import androidx.ui.res.vectorResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.ThemedPreview
import com.example.jetpackcompose.ui.lightThemeColors

val navListLabels = listOf("Home", "My Orders", "RY Wallet", "More")
val navListIcons = listOf(
    R.drawable.ic_baseline_home_24,
    R.drawable.ic_baseline_business_center_24,
    R.drawable.ic_baseline_account_balance_wallet_24,
    R.drawable.ic_baseline_more_horiz_24
)

@Composable
fun HomeBodyContent(
    modifier: Modifier = Modifier.None
) {
    Column {
        VerticalScroller(
            modifier = modifier.weight(1f)
        ) {
            Column {
                Surface(
                    color = lightThemeColors.primary
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth()
                                + Modifier.padding(16.dp, 24.dp, 12.dp, 16.dp),
                        arrangement = Arrangement.SpaceBetween
                    ) {
                        repeat(icons.size) {
                            Component1(
                                modifier = Modifier.weight(1f),
                                headerText = headerTexts[it],
                                icon = icons[it],
                                footerText = footerTexts[it],
                                labelText = labelTexts[it]
                            )
                        }
                    }
                }

                Card(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 0.dp)
                ) {
                    Component2()
                }

                Card(
                    color = colorResource(id = R.color.colorComponent3Background),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 0.dp)
                ) {
                    Spacer(modifier = Modifier.fillMaxWidth() + Modifier.preferredHeight(200.dp))
                }


//                   HorizontalGradient(
//                       colors = mutableListOf<Color>().apply {
//                           add(colorResource(id = R.color.colorComponent4BackgroundStart))
//                           add(colorResource(id = R.color.colorComponent4BackgroundEnd))
//                       },
//                       startX = Px.Zero,
//                       endY = Px.Zero
//                  )

                Card(
                    color = colorResource(id = R.color.colorComponent4BackgroundStart),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 16.dp)
                ) {
                    Spacer(modifier = Modifier.fillMaxWidth() + Modifier.preferredHeight(100.dp))
                }
            }
        }

        Footer()
    }
}


@Composable
private fun Footer() {
    var selectedIndex by state { 0 }
    BottomNavigation(
        color = Color.White
    ) {
        navListLabels.forEachIndexed { index, label ->
            BottomNavigationItem(
                activeColor = Color.Gray,
                inactiveColor = Color.LightGray,
                icon = {
                    Icon(
                        asset = vectorResource(id = navListIcons[index]),
                        tint = colorResource(id = R.color.colorBottomNavigationIcon)
                    )
                },
                text = {
                    Text(
                        text = label,
                        style = TextStyle(
                            color = colorResource(id = R.color.colorBottomNavigationText)
                        )
                    )
                },
                selected = selectedIndex == index,
                onSelected = { selectedIndex = index }
            )
        }
    }
}

@Preview("FooterPreview")
@Composable
fun FooterPreview() {
    ThemedPreview {
        Footer()
    }
}

@Preview("HomeBodyContentPreview")
@Composable
fun HomeBodyContentPreview() {
    ThemedPreview {
        HomeBodyContent()
    }
}
