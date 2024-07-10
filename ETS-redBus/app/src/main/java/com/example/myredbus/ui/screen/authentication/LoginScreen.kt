package com.example.myredbus.ui.screen.authentication

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myredbus.R
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.Gotham_Book

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController : NavHostController){
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
                .align(Alignment.End)
                .clickable {
                    navController.navigate("auth")
                },
            painter = painterResource(id = R.drawable.ic_close ),
            contentDescription = null
        )
        Text(
            text = "Mari Login ke\n" + "Akun Anda",
            fontSize = 40.sp,
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            lineHeight = 50.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Selamat Datang\n" + "Kembali!",
            fontFamily = Gotham_Book,
            fontSize = 30.sp,
            lineHeight = 40.sp,
            letterSpacing = 0.sp,
            modifier = Modifier.padding(bottom = 30.dp)
        )
        Text(
            text = "Username",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text(text = "username", fontFamily = Gotham_Book)},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Password",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "password", fontFamily = Gotham_Book)},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(),

            )
        Spacer(modifier = Modifier.height(20.dp))
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
        Spacer(modifier = Modifier.height(120.dp))
        NotHaveAccount(navController)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { navController.navigate("homescreen") },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942)),
        ) {
            Text(text = "Login")
        }
    }
}

@Composable
fun NotHaveAccount(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = "Belum punya akun?",
            fontSize = 14.sp,
            fontFamily = Gotham_Book,
            color = Color(0xFFD63942),
        )
        Spacer(modifier = Modifier.width(2.dp))
        Text(
            text = "Daftar dulu",
            fontSize = 14.sp,
            fontFamily = Gotham_Bold,
            color = Color(0xFFD63942),
            modifier = Modifier.clickable {
                navController.navigate("register")
            }
        )
    }
}