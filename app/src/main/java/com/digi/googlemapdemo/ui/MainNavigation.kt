package com.digi.googlemapdemo.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.digi.googlemapdemo.ui.screens.LocationScreen
import com.digi.googlemapdemo.ui.screens.NavigationScreen

enum class Routes(val route: String) {
    LOCATION("location"),
    NAVIGATION("navigation")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.LOCATION.route) {
        composable(Routes.LOCATION.route) {
            LocationScreen{
                navController.navigate(Routes.NAVIGATION.route)
            }
        }
        composable(Routes.NAVIGATION.route) {
            NavigationScreen()
        }

    }

}