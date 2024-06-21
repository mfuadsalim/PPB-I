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
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(64.dp))
        Image(
            painter = painterResource(id = R.drawable.img_bus),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
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
            modifier = Modifier
                .fillMaxWidth()
                .height(42.dp),
            onClick = { /*TODO*/ } ,
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
        ) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(42.dp),
            onClick = { /*TODO*/ } ,
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
            Text(text = "Register")
        }
    }
    Column(
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}