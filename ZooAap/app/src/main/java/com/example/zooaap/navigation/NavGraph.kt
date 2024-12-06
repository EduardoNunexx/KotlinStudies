package com.example.zooaap.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zooaap.ui.theme.screens.AnimalScreen
import com.example.zooaap.ui.theme.screens.HomeScreen
import com.example.zooaap.models.animalList

@ExperimentalMaterial3Api
@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onAnimalSelected = { animal ->
                navController.navigate("animal/${animal.name}")
            })
        }
        composable("animal/{animal}") { backStackEntry ->
            val animalName = backStackEntry.arguments?.getString("animal")
            val selectedAnimal = animalList.first { it.name == animalName }
            AnimalScreen(selectedAnimal)
        }
    }
}
