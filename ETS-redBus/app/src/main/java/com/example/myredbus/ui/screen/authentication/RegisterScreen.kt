package com.example.myredbus.ui.screen.authentication

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myredbus.Gotham_Bold
import com.example.myredbus.Gotham_Book

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController){
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
            text = "Daftarkan Akun\n"+"Anda",
            fontFamily = Gotham_Bold,
            fontSize = 30.sp,
            lineHeight = 40.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Daftar untuk memulai perjalan Anda dengan redBus",
            fontSize = 24.sp,
            fontFamily = Gotham_Book,
            lineHeight = 36.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Name",
            fontFamily = Gotham_Bold,
            fontSize = 16.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            placeholder = { Text(text = "name", fontFamily = Gotham_Book, color = Color(0xFFB6B6B6))},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Email",
            fontFamily = Gotham_Bold,
            fontSize = 14.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "email", fontFamily = Gotham_Book, color = Color(0xFFB6B6B6))},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            modifier = Modifier
                .fillMaxWidth(),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Username",
            fontFamily = Gotham_Bold,
            fontSize = 14.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text(text = "username", fontFamily = Gotham_Book, color = Color(0xFFB6B6B6))},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            modifier = Modifier
                .fillMaxWidth(),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Password",
            fontFamily = Gotham_Bold,
            fontSize = 14.sp,
            color = Color(0xFF292929)
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "password", fontFamily = Gotham_Book, color = Color(0xFFB6B6B6))},
            shape = RoundedCornerShape(10.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF292929),
                unfocusedBorderColor = Color(0xFFB6B6B6)
            ),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(),

            )
        Spacer(modifier = Modifier.height(8.dp))
        CheckboxRegister()
        Divider(
            color = Color.Gray,
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Spacer(modifier = Modifier.height(100.dp))
        HaveAccount(navController)
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = { navController.navigate("register") },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFD63942))
        ) {
            Text(text = "Register")
        }
    }
}

@Composable
fun HaveAccount(navController: NavHostController){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = "Sudah punya akun?",
            fontSize = 14.sp,
            fontFamily = Gotham_Book,
            color = Color(0xFFD63942)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "Login aja",
            fontSize = 14.sp,
            fontFamily = Gotham_Bold,
            color = Color(0xFFD63942),
            modifier = Modifier.clickable {
                navController.navigate("login")
            }
        )
    }
}
@Composable
fun CheckboxRegister(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        var checked by remember { mutableStateOf(false) }
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
}