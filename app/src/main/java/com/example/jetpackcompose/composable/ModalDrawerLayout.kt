package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.material.DrawerState
import androidx.ui.material.ModalDrawerLayout
import androidx.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.ThemedPreview

/**
 *
 * @see [https://joebirch.co/android/exploring-jetpack-compose-modal-drawer-layout/]
 * @see [https://www.youtube.com/watch?v=pZYcR9Us-uY&list=WL&index=2&t=185s]
 */
@Preview("ModalDrawerLayout")
@Composable
fun PreviewModalDrawerLayout() {
    ThemedPreview {
        val (currentState, stateChanged) = state { DrawerState.Closed }
        ModalDrawerLayout(
            drawerState = currentState,
            onStateChange = stateChanged,
            bodyContent = {
                Toolbar {
                    stateChanged(DrawerState.Opened)
                }
            },
            drawerContent = {
                AppDrawer {
                    stateChanged(DrawerState.Closed)
                }
            }
        )
    }
}