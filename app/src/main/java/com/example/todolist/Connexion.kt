package com.example.todolist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.todolist.composants.ElementList
import com.example.todolist.composants.SimpleFilledTextFieldSample
import com.example.todolist.ui.theme.TodoListTheme



@Composable
fun Greeting2( navController: NavController,modifier: Modifier = Modifier ) {
    Row (modifier = modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
        Column (  verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {


            SimpleFilledTextFieldSample("e-mail")

            SimpleFilledTextFieldSample("password")



            ElementList("Valider", navController , "Dashboard"
            )


        }

    }
}



