package com.example.jetpackcompose.ui.home

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.layout.Column
import androidx.ui.material.DrawerState
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.composable.AppDrawer
import com.example.jetpackcompose.composable.BottomAppBarComponent
import com.example.jetpackcompose.composable.FloatingActionButtonComponent
import com.example.jetpackcompose.composable.Toolbar
import com.example.jetpackcompose.model.Screen
import com.example.jetpackcompose.ui.ThemedPreview


@Composable
fun HomeScreen(
    currentScreen: Screen = Screen.Home,
    scaffoldState: ScaffoldState = remember { ScaffoldState() }
) {
    Column {
        val fabShape = CircleShape
        Scaffold(
            scaffoldState = scaffoldState,
            drawerContent = {
                AppDrawer(
                    currentScreen = currentScreen,
                    closeDrawer = { scaffoldState.drawerState = DrawerState.Closed }
                )
            },
            topAppBar = {
                Toolbar {
                    scaffoldState.drawerState = DrawerState.Opened
                }
            },
            bodyContent = { modifier ->
                HomeBodyContent(modifier = modifier)
            },
            floatingActionButton = {
                FloatingActionButtonComponent(fabShape)
            },
            bottomAppBar = { fabConfiguration ->
                BottomAppBarComponent(
                    fabConfiguration = fabConfiguration,
                    cutoutShape = fabShape
                )
            },
            floatingActionButtonPosition = Scaffold.FabPosition.CenterDocked
        )
    }
}


@Preview("HomeScreen")
@Composable
fun PreviewHomeScreen() {
    ThemedPreview {
        HomeScreen(currentScreen = Screen.Home)
    }
}

