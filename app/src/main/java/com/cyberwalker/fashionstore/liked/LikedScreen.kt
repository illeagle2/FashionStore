package com.cyberwalker.fashionstore.liked

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cyberwalker.fashionstore.dump.BottomBar
import com.cyberwalker.fashionstore.home.HomeScreenActions

@Composable
fun LikedScreen(
    //viewModel: HomeViewModel = hiltViewModel(),
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    onAction: (actions: HomeScreenActions) -> Unit,
    navController: NavHostController
) {
    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { innerPadding ->
        LikedScreenContent(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun LikedScreenContent(modifier: Modifier) {

    Text(text = "Liked Screen")
}