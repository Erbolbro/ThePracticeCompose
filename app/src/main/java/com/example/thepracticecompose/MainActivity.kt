package com.example.thepracticecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.thepracticecompose.ui.screens.dz.homework1.MikeJohnson

//import com.example.thepracticecompose.ui.screens.test.counter.BtnPlus

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            Column(modifier = Modifier.padding(top = 10.dp)) {

                MikeJohnson()
//            BtnPlus()
//            }
        }
    }
}