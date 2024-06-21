package com.example.myredbus.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.R

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_avatar),
                    contentDescription = "Avatar",
                    modifier = Modifier
                        .size(36.dp),
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Welcome, Fuad",
                    fontFamily = Gotham_Bold,
                    fontSize = 18.sp,
                    letterSpacing = 0.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_belldark),
                contentDescription = null,
                modifier = Modifier
                    .size(26.dp),
            )
        }
    Text(text = "Mau Kemana Hari ini Bosku?")
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
        ){
        Image(
            painter = painterResource(id = R.drawable.wl_redbuscard),
            contentDescription = "card-redBus",
            modifier = Modifier.fillMaxSize(),
        )
    }
    }
}