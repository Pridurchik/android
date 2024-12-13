package com.hackton.schoolblog.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppHavGraph(
    navHostController: NavHostController,
    AuthContent: @Composable () -> Unit,
    HomeContent: @Composable () -> Unit,
    RegistContent: @Composable () -> Unit,
    ProfileContent: @Composable () -> Unit,
    ScheduleContent: @Composable () -> Unit,
) {

    NavHost(
        navController = navHostController,
        startDestination = Screen.Regist.route
    ) {
        composable(Screen.Schedule.route) {
            ScheduleContent()
        }

        composable(Screen.Auth.route) {
            RegistContent()
        }

        composable(Screen.Regist.route) {
            AuthContent()
        }

        composable(Screen.Profile.route) {
            ProfileContent()
        }

        composable(Screen.Home.route) {
            HomeContent()
        }

    }
}