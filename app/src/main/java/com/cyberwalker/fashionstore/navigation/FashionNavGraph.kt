/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("OPT_IN_IS_NOT_ENABLED")

package com.cyberwalker.fashionstore.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cyberwalker.fashionstore.home.HomeScreen
import com.cyberwalker.fashionstore.login.LoginScreen
import com.cyberwalker.fashionstore.splash.SplashScreen


@Composable
fun FashionNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.SPLASH,
    ) {

       // authNavGraph(navController = navController)
//        composable(route = Graph.HOME){
//            HomeScreen()
//        }
        composable(route= Graph.SPLASH){
            SplashScreen(onClick = {
                navController.popBackStack()
                navController.navigate(Graph.LOGIN)
            }
            )
        }
        composable(route= Graph.LOGIN) {
            LoginScreen(
                onLoginClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                }
            )
        }
        composable(route = Graph.HOME){
            HomeScreen()
        }


    }
}

object Graph {
    const val ROOT = "root_graph"//
    const val DETAILS = "details_graph"
    const val SPLASH ="splash"
    const val LOGIN = "login"
    const val HOME = "home_graph"
//    const val AUTHENTICATION = "auth_graph"
}
