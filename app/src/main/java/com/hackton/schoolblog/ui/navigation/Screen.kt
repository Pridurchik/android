package com.hackton.schoolblog.ui.navigation


sealed class Screen(
    val route: String
) {

    data object Auth: Screen(
        route = AUTH_SCREEN
    )
    data object Regist: Screen(
        route = REGIST_SCREEN
    )
    data object Profile: Screen(
        route = PROFILE_SCREEN
    )
    data object Schedule: Screen(
        route = SCHEDULE_SCREEN
    )
    data object Home: Screen(
        route = HOME_SCREEN
    )


    private companion object {
        const val AUTH_SCREEN = "auth"
        const val REGIST_SCREEN = "regist"
        const val PROFILE_SCREEN = "profile"
        const val HOME_SCREEN = "home"
        const val SCHEDULE_SCREEN = "schedule"
    }
}