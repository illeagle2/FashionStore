package com.cyberwalker.fashionstore.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import androidx.navigation.compose.composable
import com.cyberwalker.fashionstore.login.LoginScreen
import com.cyberwalker.fashionstore.navigation.Graph

//fun NavGraphBuilder.authNavGraph(navController: NavController) {
//    navigation(
//        route = Graph.AUTHENTICATION,
//        startDestination = AuthScreen.Login.route
//    ) {
//        composable(route = AuthScreen.Login.route){
//            LoginScreen(onLoginClick = {
//                navController.popBackStack()
//                navController.navigate(Graph.HOME) })
//        }
//
//    }
//}

sealed class AuthScreen(val route: String){
    object Login: AuthScreen(route = "LOGIN")
}