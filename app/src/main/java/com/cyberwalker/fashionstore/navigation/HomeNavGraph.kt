package com.cyberwalker.fashionstore.home

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.cyberwalker.fashionstore.dump.BottomNavItem
import com.cyberwalker.fashionstore.liked.LikedScreenContent
import com.cyberwalker.fashionstore.navigation.Graph
import com.cyberwalker.fashionstore.profile.ProfileScreenContent
import com.cyberwalker.fashionstore.search.SearchScreenContent

@Composable
fun HomeNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomNavItem.Home.screen_route
    ) {
        composable(route = BottomNavItem.Home.screen_route){
            ScreenContent(
                name = BottomNavItem.Home.screen_route,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                }
            )
        }
        composable(route = BottomNavItem.Liked.screen_route){
            LikedScreenContent(Modifier)
        }
        composable(route = BottomNavItem.Profile.screen_route){
            ProfileScreenContent(Modifier)
        }
        composable(route = BottomNavItem.Search.screen_route){
            SearchScreenContent(Modifier)
        }
    }
}

//fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
//    navigation(
//        route = Graph.DETAILS,
//        startDestination = Screen.Detail.route
//    ) {
//        composable(route = DetailsScreen.Information.route) {
//            ScreenContent(name = DetailsScreen.Information.route) {
//                navController.navigate(DetailsScreen.Overview.route)
//            }
//        }
//        composable(route = DetailsScreen.Overview.route) {
//            ScreenContent(name = DetailsScreen.Overview.route) {
//                navController.popBackStack(
//                    route = DetailsScreen.Information.route,
//                    inclusive = false
//                )
//            }
//        }
//    }
//}