package com.example.poxuig

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.poxuig.screens.CalendarScreen
import com.example.poxuig.screens.HomeScreen
import com.example.poxuig.screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route){
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Calendar.route){
            CalendarScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }
    }

}


