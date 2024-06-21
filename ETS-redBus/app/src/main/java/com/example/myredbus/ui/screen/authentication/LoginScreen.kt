package com.example.myredbus.ui.screen.authentication

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myredbus.R
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier
            .padding(28.dp)
            .fillMaxSize(),
    ) {
        var username by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        Image(
            modifier = Modifier
                .size(28.dp)
                .align(Alignment.End),
            painter = painterResource(id = R.drawable.ic_close ),
            contentDescription = null
        )
        Text(
            text = "Mari Login ke Akun Anda"
        )
        Text(
            text = "Selamat Datang Kembali!"
        )
        Text(text = "Username")
        TextField(value = username, onValueChange = {it} )
        Text(text = "Password")
        TextField(value = password, onValueChange = {it} )
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Text(text = "Login Dengan")
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                modifier = Modifier
                    .size(64.dp),
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .size(64.dp),
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .size(64.dp),
                painter = painterResource(id = R.drawable.ic_twitter),
                contentDescription = null
            )
        }
        Text(text = "Belum Punya AKun? Daftar Dulu")
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Login")
        }
    }
}