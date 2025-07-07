package com.ikhzan.taskclient.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ikhzan.taskclient.R

@Composable
fun RegisterScreen(navController: NavController){
    Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Text("Registration", style = TextStyle(fontSize = 30.sp))
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField( modifier = Modifier.fillMaxWidth(), onValueChange = {}, value = "", label = { Text("Full name") })
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField( modifier = Modifier.fillMaxWidth(), onValueChange = {}, value = "", label = { Text("Email") })
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(modifier = Modifier.fillMaxWidth(),onValueChange = {}, value = "", label = { Text("Username") })
        Spacer(modifier = Modifier.height(20.dp))
        Button(modifier = Modifier.fillMaxWidth(), onClick = { }, shape = RoundedCornerShape(20)) {
            Text("Sign Up")
        }
        Spacer(modifier = Modifier.height(50.dp))
        HorizontalDivider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Already have account")
            Spacer(modifier = Modifier.width(20.dp))
            TextButton(onClick = {}) {
                Text("Login")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "", modifier = Modifier.width(50.dp))
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.github), contentDescription = "", modifier = Modifier.width(50.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}