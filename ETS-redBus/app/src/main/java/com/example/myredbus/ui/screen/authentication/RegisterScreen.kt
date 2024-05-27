package com.example.myredbus.ui.screen.authentication

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.Gotham_Book

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(){
    val loginremind = buildAnnotatedString {
        append("Sudah Punya Akun? ")
        withStyle(style = SpanStyle(
            fontFamily = Gotham_Bold ,
            fontWeight = FontWeight.Bold)
        ) {
            append("Login Aja")
        }
    }
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
        Text(
            text = "Daftarkan Akun\n" + "Anda",
            fontFamily = Gotham_Bold,
            fontSize = 30.sp,
            letterSpacing = 0.sp,
            lineHeight = 30.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Daftar untuk memulai\n" + "perjalan Anda dengan redBus",
            fontFamily = Gotham_Book,
            fontSize = 24.sp,
            lineHeight = 30.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Name",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
            )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            placeholder = { Text(text = "name", fontFamily = Gotham_Book)},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color(0xFF292929),
            unfocusedBorderColor = Color(0xFFB6B6B6)
        ),
        modifier = Modifier
            .fillMaxWidth(),
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Email",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
            )

        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = email,
            placeholder = { Text(text = "email", fontFamily = Gotham_Book)},
            onValueChange = { email = it },
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            modifier = Modifier
                .fillMaxWidth(),
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Username",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(8.dp))
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
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Password",
            fontFamily = Gotham_Bold,
            letterSpacing = 0.sp,
            color = Color(0xFF292929)
        )

        Spacer(modifier = Modifier.height(8.dp))
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
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xFFD63942),
                    uncheckedColor = Color(0xFF292929)
                ))
            Text(
                text = "Saya menyetujui semua syarat & ketentuan",
                fontFamily = Gotham_Book,
                fontSize = 14.sp,
                letterSpacing = 0.sp,
                color = Color(0xFFD63942)
                )
        }
        Spacer(modifier = Modifier.height(70.dp))
        Divider(
            color = Color(0xFFB6B6B6),
            thickness = 1.dp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = loginremind,
            fontFamily = Gotham_Book,
            color = Color(0xFFD63942),
            letterSpacing = 0.sp
            )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942))
        ) {
            Text(
                text = "Register",
                fontFamily = Gotham_Bold,
                fontSize = 22.sp,
                letterSpacing = 0.sp)
        }
    }
}