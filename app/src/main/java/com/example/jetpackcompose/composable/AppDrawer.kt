package com.example.jetpackcompose.composable

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.layout.Column
import androidx.ui.layout.Spacer
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.preferredHeight
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.model.Screen
import com.example.jetpackcompose.model.Status
import com.example.jetpackcompose.ui.ThemedPreview

@Composable
fun AppDrawer(
    currentScreen: Screen,
    closeDrawer: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        DrawerButton(
            icon = R.drawable.ic_baseline_home_24,
            label = "Home",
            isSelected = currentScreen == Screen.Home
        ) {
            Status.currentScreen = Screen.Home
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_baseline_train_24,
            label = "Trains",
            isSelected = currentScreen == Screen.Trains
        ) {
            Status.currentScreen = Screen.Trains
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_baseline_directions_bus_24,
            label = "Bus",
            isSelected = currentScreen == Screen.Bus
        ) {
            Status.currentScreen = Screen.Bus
            closeDrawer()
        }


        DrawerButton(
            icon = R.drawable.ic_baseline_fastfood_24,
            label = "Food on Train",
            isSelected = currentScreen == Screen.FoodOnTrain
        ) {
            Status.currentScreen = Screen.FoodOnTrain
            closeDrawer()
        }


        DrawerButton(
            icon = R.drawable.ic_baseline_airline_seat_recline_extra_24,
            label = "Seat Availability",
            isSelected = currentScreen == Screen.SeatAvailability
        ) {
            Status.currentScreen = Screen.SeatAvailability
            closeDrawer()
        }



        DrawerButton(
            icon = R.drawable.ic_baseline_announcement_24,
            label = "Live Train Announcement",
            isSelected = currentScreen == Screen.LiveTrainAnnouncement
        ) {
            Status.currentScreen = Screen.LiveTrainAnnouncement
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_baseline_account_balance_wallet_24,
            label = "Wallet",
            isSelected = currentScreen == Screen.Wallet
        ) {
            Status.currentScreen = Screen.Wallet
            closeDrawer()
        }

        DrawerButton(
            icon = R.drawable.ic_baseline_info_24,
            label = "Info",
            isSelected = currentScreen == Screen.Info
        ) {
            Status.currentScreen = Screen.Info
            closeDrawer()
        }


    }
}


@Preview("AppDrawer")
@Composable
fun PreviewAppDrawer() {
    ThemedPreview {
        AppDrawer(
            currentScreen = Screen.Home,
            closeDrawer = { }
        )
    }
}


