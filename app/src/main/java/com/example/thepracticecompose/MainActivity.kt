package com.example.thepracticecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                ListCard("Aizen", "Shinigami")
                ListCard("Aizen", "Shinigami")
                ListCard("Aizen", "Shinigami")
                ListCard("Aizen", "Shinigami")
                ListCard("Aizen", "Shinigami")
            }
        }
    }

    @Composable
    private fun ListCard(name: String, prof: String) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            shape = RoundedCornerShape(15.dp),
        ) {
            Box(modifier = Modifier.fillMaxWidth().background(Color.White)) {
                Row(
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.aizen),
                        contentDescription = "Aizen",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .padding(4.dp)
                            .clip(CircleShape)
                    )
                    Column(modifier = Modifier.padding(start = 16.dp)) {
                        Text(text = name)
                        Text(text = prof)
                    }
                }
            }
        }
    }
}