package com.example.myredbus

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myredbus.ui.screen.authentication.AuthScreen
import com.example.myredbus.ui.screen.authentication.LoginScreen
import com.example.myredbus.ui.screen.authentication.OnboardingScreen
import com.example.myredbus.ui.screen.authentication.RegisterScreen
import com.example.myredbus.ui.screen.home.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            MyredBusTheme{
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    NavApp()
                }
            }

        }
    }
}

@Composable
fun NavApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "on boarding") {
        composable("on boarding") { OnboardingScreen(navController) }
        composable("auth") { AuthScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
    }
}
