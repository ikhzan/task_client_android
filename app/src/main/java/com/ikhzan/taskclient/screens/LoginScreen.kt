package com.ikhzan.taskclient.screens

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController){
    val usernameState = rememberTextFieldState()
    Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("SIGN IN", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold))
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(onValueChange = {}, value = "", label = { Text("username") })
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(onValueChange = {}, value = "", label = { Text("password") })
        Spacer(modifier = Modifier.height(20.dp))
        Button(modifier = Modifier.fillMaxWidth(), onClick = { }, shape = RoundedCornerShape(20)) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(30.dp))
        HorizontalDivider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(50.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Don't have account ? ")
            TextButton(onClick = {}) {
                Text("Register")
            }
        }
    }
}