package com.ikhzan.taskclient.components

enum class Screen {
    SPLASH,
    HOME,
    LOGIN,
    REGISTER
}

sealed class NavigationItem(val route: String) {
    object Splash : NavigationItem(Screen.SPLASH.name)
    object Home : NavigationItem(Screen.HOME.name)
    object Login : NavigationItem(Screen.LOGIN.name)
    object Register : NavigationItem(Screen.REGISTER.name)
}