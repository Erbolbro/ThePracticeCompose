package com.example.thepracticecompose.ui.screens.dz.homework1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thepracticecompose.R

//@Preview(showBackground = true)
@Composable
fun MikeJohnson() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(start = 15.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .width(130.dp),
                shape = RoundedCornerShape(15.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.image),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(130.dp)
                        .height(137.dp)
                )
            }

            Column(modifier = Modifier.fillMaxWidth()) {
                Row(modifier = Modifier) {
                    Text(
                        text = "Aizen",
                        color = Color.White,
                        modifier = Modifier,
                        fontSize = 30.sp
                    )
                    Image(
                        painter = painterResource(R.drawable.add_user),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 10.dp),
                        alignment = Alignment.TopEnd,

                        )
                }
                Text(
                    text = "Johnson ",
                    color = Color.White,
                    modifier = Modifier,
                    fontSize = 30.sp
                )
            }
        }
    }

}