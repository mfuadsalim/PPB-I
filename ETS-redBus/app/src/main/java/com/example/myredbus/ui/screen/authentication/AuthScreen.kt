package com.example.myredbus.ui.screen.authentication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.material3.OutlinedButton
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
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.Gotham_Book
import com.example.myredbus.Gotham_Bookitalic
import com.example.myredbus.R

@Composable
fun AuthScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "@mfuadsalim",
            fontFamily = Gotham_Bookitalic,
            fontSize = 16.sp,
            color = Color(0xFFD63942)
        )
        Spacer(modifier = Modifier.height(72.dp))
        Image(
            painter = painterResource(id = R.drawable.img_bus),
            contentDescription = null,
            modifier = Modifier
                .size(330.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Selamat Datang di redBus!",
            fontSize = 28.sp,
            fontFamily = Gotham_Bold,
            textAlign = TextAlign.Center,
            lineHeight = 36.sp,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            fontSize = 14.sp,
            fontFamily = Gotham_Book,
            text = "Masuk atau daftar sekarang untuk menikmati\n" +
                    "kemudahan memesan tiket bus, menemukan\n" +
                    "rute, dan melihat jadwal dengan redBus.",
            textAlign = TextAlign.Center,
            lineHeight = 16.sp,
            color = Color(0xFFB6B6B6)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            onClick = { /*TODO*/ } ,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942))
        ) {
            Text(
                text = "Login",
                fontFamily = Gotham_Bold,
                fontSize = 22.sp,
                letterSpacing = 0.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            onClick = { /*TODO*/ } ,
            border = BorderStroke(1.dp, Color(0xFFD63942)),
            colors = ButtonDefaults.buttonColors(Color(0xFFFFFFF))
            ) {
            Text(
                text = "Register",
                fontFamily = Gotham_Bold,
                fontSize = 22.sp,
                letterSpacing = 0.sp,
                color = Color(0xFFD63942)
                )
        }
    }
}