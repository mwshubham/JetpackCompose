package com.example.jetpackcompose.model

import androidx.compose.Model

/**
 * Class defining the screens we have in the app: home, trains
 */
sealed class Screen {
    object Home : Screen()
    object Trains : Screen()
    object Bus : Screen()
    object FoodOnTrain : Screen()
    object SeatAvailability : Screen()
    object LiveTrainAnnouncement : Screen()
    object Wallet : Screen()
    object Info : Screen()
}

@Model
object Status {
    var currentScreen: Screen = Screen.Home
}