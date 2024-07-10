package com.example.myredbus.ui.screen.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.R

@Composable
fun AuthScreen(navController : NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "@mfuadsalim",
            fontSize = 24.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(64.dp))
        Image(
            painter = painterResource(id = R.drawable.img_bus),
            contentDescription = null,
            modifier = Modifier
                .size(270.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Selamat Datang di redBus!",
            fontSize = 36.sp,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            lineHeight = 36.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            fontSize = 16.sp,
            text = "Masuk atau daftar sekarang untuk menikmati\n" +
                    "kemudahan memesan tiket bus, menemukan\n" +
                    "rute, dan melihat jadwal dengan redBus.",
            textAlign = TextAlign.Center,
            lineHeight = 24.sp
        )
        Spacer(modifier = Modifier.height(36.dp))
        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942)),
        ) {
            Text(
                text = "Login",
                fontFamily = Gotham_Bold,
                fontSize = 18.sp,
                letterSpacing = 0.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { navController.navigate("register") },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942)),
            ) {
            Text(
                text = "Register",
                fontFamily = Gotham_Bold,
                fontSize = 18.sp,
                letterSpacing = 0.sp
            )
        }
    }
    Column(
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}