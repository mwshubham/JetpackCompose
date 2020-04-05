package com.example.jetpackcompose.ui.home

import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.layout.Column
import androidx.ui.material.DrawerState
import androidx.ui.material.Scaffold
import androidx.ui.material.ScaffoldState
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.composable.AppDrawer
import com.example.jetpackcompose.composable.Toolbar
import com.example.jetpackcompose.model.Screen
import com.example.jetpackcompose.ui.ThemedPreview


@Composable
fun HomeScreen(
    currentScreen: Screen = Screen.Home,
    scaffoldState: ScaffoldState = remember { ScaffoldState() }
) {
    Column {
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
            bodyContent = {
                //                    modifier ->
                //                HomeScreenBody(modifier = modifier, posts = posts)
            }
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

