package com.hackton.schoolblog.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.rememberNavController

class NavigationState(
    val navController: NavHostController
) {


    inline fun navigateTo(
        route: String,
        crossinline block : NavOptionsBuilder.(route: String) -> Unit
    ) {

        navController.navigate(route) {
            block(
                NavOptionsBuilder(),
                route
            )
        }

    }


}


@Composable
fun rememberNavState(
    navHostController: NavHostController = rememberNavController()
) : NavigationState {
    return remember {
        NavigationState(navHostController)
    }
}
