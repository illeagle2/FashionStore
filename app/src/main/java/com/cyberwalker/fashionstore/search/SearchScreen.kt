package com.cyberwalker.fashionstore.search

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
fun SearchScreen(
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
        SearchScreenContent(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun SearchScreenContent(modifier: Modifier) {

    Text(text = "Search Screen")
}
