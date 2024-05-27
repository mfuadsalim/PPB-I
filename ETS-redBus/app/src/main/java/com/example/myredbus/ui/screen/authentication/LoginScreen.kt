package com.example.myredbus.ui.screen.authentication

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.Image
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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.Gotham_Book

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    val registerremind = buildAnnotatedString {
        append("Belum Punya Akun? ")
        withStyle(style = SpanStyle(
            fontFamily = Gotham_Bold ,
            fontWeight = FontWeight.Bold)) {
            append("Daftar Dulu")
        }
    }
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
                .size(24.dp)
                .align(Alignment.End),
            painter = painterResource(id = R.drawable.ic_close ),
            contentDescription = null
        )
        Text(
            text = "Mari Login ke\n" +"akun Anda",
            fontFamily = Gotham_Bold,
            fontSize = 30.sp,
            letterSpacing = 0.sp,
            lineHeight = 30.sp,
            color = Color(0xFF292929)

        )
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "Selamat Datang Kembali!",
            fontFamily = Gotham_Book,
            fontSize = 30.sp,
            lineHeight = 36.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Username",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(12.dp))
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
                .fillMaxWidth(),

        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Password",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(12.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "username", fontFamily = Gotham_Book)},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(),

            )
        Spacer(modifier = Modifier.height(16.dp))
        Divider(color = Color(0xFFB6B6B6))
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Login Dengan",
            fontFamily = Gotham_Book,
            fontSize = 14.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                modifier = Modifier
                    .size(54.dp),
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .size(54.dp),
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier
                    .size(54.dp),
                painter = painterResource(id = R.drawable.ic_twitter),
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.height(170.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = registerremind,
            fontFamily = Gotham_Book,
            color = Color(0xFFD63942),
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942))
        ) {
            Text(
                text = "Login",
                fontFamily = Gotham_Bold,
                fontSize = 22.sp,
                letterSpacing = 0.sp)
        }
    }
}