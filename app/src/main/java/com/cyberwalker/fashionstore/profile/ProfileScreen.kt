package com.cyberwalker.fashionstore.profile

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cyberwalker.fashionstore.dump.BottomNav
import com.cyberwalker.fashionstore.home.HomeScreenActions
import com.cyberwalker.fashionstore.search.SearchScreenContent

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
            BottomNav(navController = navController)
        }
    ) { innerPadding ->
        ProfileScreenContent(modifier = Modifier.padding(innerPadding), onAction = onAction)
    }
}

@Composable
fun ProfileScreenContent(modifier: Modifier, onAction: (actions: HomeScreenActions) -> Unit) {

    Text(text = "Profile Screen")
}