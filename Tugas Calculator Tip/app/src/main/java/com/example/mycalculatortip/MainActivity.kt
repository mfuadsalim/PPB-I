package com.example.mycalculatortip

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
 import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var num1 by remember {
                mutableStateOf("")
            }
            var num2 by remember {
                mutableStateOf("")
            }
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    TextField(
                        value = num1,
                        onValueChange = { num1 = it } ,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        label = { Text(text = "Bilangan pertama")},
                        placeholder = { Text(text = "0")},
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    TextField(
                        value = num2,
                        onValueChange = { num2 =  it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        label = { Text(text = "Bilangan kedua")},
                        placeholder = { Text(text = "0")},
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                    )

                    Row(
                        modifier = Modifier.padding( vertical = 16.dp)
                    ){
                        Button(onClick = {
                            val result = (num1.toDoubleOrNull() ?: 0.0) + (num2.toDoubleOrNull() ?: 0.0)
                            Toast.makeText(applicationContext, "Hasilnya adalah $result", Toast.LENGTH_SHORT).show()
                        }) {
                            Text(text = "Tambah")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(onClick = {
                            val result = (num1.toDoubleOrNull() ?: 0.0) - (num2.toDoubleOrNull() ?: 0.0)
                            Toast.makeText(applicationContext, "Hasilnya adalah $result", Toast.LENGTH_SHORT).show()
                        }) {
                            Text(text = "Kurang")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(onClick = {
                            val result = (num1.toDoubleOrNull() ?: 0.0) * (num2.toDoubleOrNull() ?: 0.0)
                            Toast.makeText(applicationContext, "Hasilnya adalah $result", Toast.LENGTH_SHORT).show()
                        }) {
                            Text(text = "Kali")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                        Button(onClick = {
                            val num2Value = num2.toDoubleOrNull() ?: 0.0
                            val result = (num1.toDoubleOrNull() ?: 0.0) / num2Value
                            Toast.makeText(applicationContext, "Hasilnya adalah $result", Toast.LENGTH_SHORT).show()
                        }) {
                            Text(text = "Bagi")
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }

        }

            }
        }

