package com.cyberwalker.fashionstore.profile

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
fun ProfileScreen(
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
        ProfileScreenContent(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun ProfileScreenContent(modifier: Modifier) {

    Text(text = "Profile Screen")
}