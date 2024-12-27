package com.example.thepracticecompose.ui.screens.test.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun BtnPlus() {
    val counter = remember {
        mutableIntStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.White)
    }
    val historyColor = remember { mutableStateOf(mutableListOf<Color>()) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = color.value)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                modifier = Modifier
                    .width(150.dp)
                    .height(80.dp)
                    .padding(10.dp),
                onClick = {
                    if (counter.intValue > 0) {
                        counter.intValue--
                        if (historyColor.value.isNotEmpty()) {
                            color.value = historyColor.value.removeAt(historyColor.value.size - 1)
                        }
                    }
                }
            ) {
                Text(text = "-", fontSize = 22.sp)
            }

            Text(text = counter.intValue.toString(), fontSize = 50.sp)

            Button(
                modifier = Modifier
                    .width(150.dp)
                    .height(80.dp)
                    .padding(10.dp),
                onClick = {
                    if (counter.intValue < 100) {
                        if (counter.intValue >= 0) {
                            historyColor.value.add(color.value)
                        }
                        when (++counter.intValue) {
                            10 -> color.value = Color.DarkGray
                            20 -> color.value = Color.Cyan
                            30 -> color.value = Color.Unspecified
                            40 -> color.value = Color.Magenta
                            50 -> color.value = Color.Red
                            60 -> color.value = Color.LightGray
                            70 -> color.value = Color.Transparent
                            80 -> color.value = Color.Blue
                            90 -> color.value = Color.Green
                            100 -> color.value = Color.Yellow
                        }
                    }
                }
            ) {
                Text(text = "+", fontSize = 22.sp)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            when (counter.intValue) {
                0 -> Text(text = "дойди до 10", fontSize = 70.sp)
                10 -> Text(text = "харош ", fontSize = 70.sp)
                15 -> Text(text = "давай до 20", fontSize = 70.sp)
                20 -> Text(text = "ого😮", fontSize = 70.sp)
                25 -> Text(text = "хочешь еще?😏", fontSize = 70.sp)
                30 -> Text(text = "МАШИНА😎", fontSize = 70.sp)
                40 -> Text(text = "все все бро успокойся", fontSize = 70.sp)
                50 -> Text(text = "я сказал успокойся", fontSize = 70.sp)
                60 -> Text(text = "остановись йоу", fontSize = 70.sp)
                70 -> Text(text = "ты хочешь узнать что будет в конце?", fontSize = 70.sp)
                80 -> Text(text = "ты меня вынудил", fontSize = 70.sp)
                90 -> Text(text = "ну всё", fontSize = 70.sp)
                95 -> Text(text = "фирменная фраза айтишников", fontSize = 70.sp)
                100 -> Text(text = "hello world", fontSize = 70.sp)
            }
        }
    }
}