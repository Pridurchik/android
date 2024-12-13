package com.hackton.schoolblog.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hackton.features.auth_features.ui.Auth
import com.hackton.features.main_features.home_features.ui.Home
import com.hackton.features.main_features.profile_features.ui.Profile
import com.hackton.features.main_features.schedule_features.ui.Schedule
import com.hackton.features.regist_features.ui.Registration
import com.hackton.schoolblog.ui.navigation.AppHavGraph
import com.hackton.schoolblog.ui.navigation.NavigationItem


@Preview
@Composable
fun ScreenProject() {

    val hostController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                /**
                 * Тут мы просто получаем текущий открытый экран
                 **/

                val navBackStackEntry by hostController.currentBackStackEntryAsState()
                val currentRout = navBackStackEntry?.destination?.route

                val items = listOf(
                    NavigationItem.Home,
                    NavigationItem.Profile,
                    NavigationItem.Schedule,
                )



                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentRout == item.screen.route,
                        onClick = {
                            hostController.navigate(item.screen.route) {
                                launchSingleTop = true
                            }
                        },
                        icon = { Icon(item.icon, contentDescription = null) },
                        label = {
                            Text(text = stringResource(id = item.titleResId))
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.Black,
                            unselectedIconColor = Color.Red
                        )
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            AppHavGraph(
                navHostController = hostController,
                AuthContent = {
                    Auth()
                },
                HomeContent = {
                    Home()
                },
                RegistContent = {
                    Registration()
                },
                ProfileContent = {
                    Profile()
                }
            ) {
                Schedule()
            }
        }
    }
}