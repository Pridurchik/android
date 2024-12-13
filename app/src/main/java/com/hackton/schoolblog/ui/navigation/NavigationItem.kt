package com.hackton.schoolblog.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.hackton.schoolblog.R

sealed class NavigationItem(
    val screen: Screen,
    val titleResId : Int,
    val icon : ImageVector
) {

    data object Home:  NavigationItem(
        screen = Screen.Home,
        titleResId = R.string.navigationItem_home,
        icon = Icons.Outlined.Home,
    )

    data object Profile: NavigationItem(
        screen = Screen.Profile,
        titleResId = R.string.navigationItem_profile,
        icon = Icons.Outlined.Person,
    )

    data object Schedule: NavigationItem(
        screen = Screen.Schedule,
        titleResId = R.string.navigationItem_Schedule,
        icon = Icons.Outlined.ShoppingCart,
    )

}
