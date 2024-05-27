package com.example.myredbus

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.myredbus.ui.screen.authentication.AuthScreen
import com.example.myredbus.ui.screen.authentication.LoginScreen
import com.example.myredbus.ui.screen.authentication.OnboardingScreen
import com.example.myredbus.ui.screen.authentication.RegisterScreen

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
                    RegisterScreen()
                }
            }

        }
    }
}
