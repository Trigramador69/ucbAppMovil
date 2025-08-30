package com.example.ucbapp.navigation

 sealed class Screen(val route: String) {
     object Login:Screen(route="login")
     object Home:Screen(route="home")
     object Profile:Screen(route="profile")
     object GitHub: Screen(route="github")
}