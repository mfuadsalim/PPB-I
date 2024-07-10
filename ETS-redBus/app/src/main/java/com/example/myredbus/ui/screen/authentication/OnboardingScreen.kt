package com.example.myredbus.ui.screen.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import com.example.myredbus.Gotham_Book
import com.example.myredbus.R

@Composable
fun OnboardingScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
//        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(
            id = R.drawable.wl_onboardscreen),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            Alignment.TopCenter
        )
    }
    Column(
        modifier = Modifier
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(530.dp))
        Text(
            text = "Ayo Pesan Bus Anda hanya dengan Satu Ketukan.",
            color = Color(0xFF292929),
            fontFamily = Gotham_Bold,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            lineHeight = 30.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Pesan tiket bus Anda dengan mudah, temukan rute dan jadwal dalam beberapa ketukan saja!",
            color = Color(0xFFB6B6B6),
            fontFamily = Gotham_Book,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            lineHeight = 16.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            modifier = Modifier
                .size(50.dp),
            painter = painterResource(id = R.drawable.ic_swipe),
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { navController.navigate("auth") },
            modifier = Modifier
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942)),
            ) {
            Row (
                modifier = Modifier
                    .width(250.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Jelajahi Sekarang",
                    fontFamily = Gotham_Bold,
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    painter = painterResource(id = R.drawable.rightarrow),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
            }

        }
    }
}