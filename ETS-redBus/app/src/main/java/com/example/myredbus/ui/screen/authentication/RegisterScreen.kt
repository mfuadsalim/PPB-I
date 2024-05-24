package com.example.myredbus.ui.screen.authentication

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RegisterScreen(){
    Column (
        modifier = Modifier
            .padding(28.dp)
            .fillMaxSize()
    ){
        var nama by remember {
            mutableStateOf("")
        }
        var email by remember {
            mutableStateOf("")
        }
        var username by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        var checked by remember {
            mutableStateOf(false)
        }
        Text(text = "Daftarkan Akun Anda")
        Text(text = "Daftar untuk memulai perjalan Anda dengan redBus")
        Text(text = "Name")
        TextField(value = nama, onValueChange = {it} )
        Text(text = "Email")
        TextField(value = email, onValueChange = {it} )
        Text(text = "Username")
        TextField(value = username, onValueChange = {it} )
        Text(text = "Password")
        TextField(value = password, onValueChange = {it} )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it } )
            Text(text = "Saya menyetujui semua syarat & ketentuan")
        }
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Text(text = "Sudah Punya Akun? Login Aja")
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Register")
        }
    }
}