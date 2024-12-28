package com.example.thepracticecompose.ui.screens.dz.homework1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thepracticecompose.R

@Preview(showBackground = true)
@Composable
fun MikeJohnson() {
    Box(
        modifier = Modifier
            .fillMaxSize()            .background(color = Color(0xFF343841))

//            .padding(start = 15.dp, end = 15.dp)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF343841))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
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
                            .height(135.dp)
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

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 30.dp, end = 10.dp, start = 5.dp),
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Image(
                            painter = painterResource(R.drawable.packet),
                            contentDescription = "",
                        )
                        Image(painter = painterResource(R.drawable.sms24), contentDescription = "")
                        Image(painter = painterResource(R.drawable.start5), contentDescription = "")
                    }
                }
            }
            Box(modifier = Modifier.fillMaxWidth().padding(15.dp)) {
                Column {
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Row(modifier = Modifier, verticalAlignment = Alignment.CenterVertically) {
                            Text("17", fontSize = 100.sp, color = Color.Black)
                            Column(modifier = Modifier) {
                                Text(
                                    text = "Passed",
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier,
                                )
                                Text(
                                    text = "Levels",
                                    fontSize = 30.sp,
                                    modifier = Modifier,
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
                                    color = Color.Black,
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Card(
                                        modifier = Modifier
                                            .fillMaxWidth(),
                                        shape = RoundedCornerShape(10.dp),
                                    ) {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .background(Color(0xFF4C60C2)),
                                            verticalAlignment = Alignment.CenterVertically
                                        )
                                        {
                                            Text(
                                                text = "62",
                                                fontSize = 100.sp,
                                                color = Color.White
                                            )
                                            Column(modifier = Modifier.fillMaxWidth()) {
                                                Text(
                                                    text = "Heart",
                                                    fontSize = 20.sp,
                                                    color = Color.White,
                                                    modifier = Modifier,
                                                )
                                                Text(
                                                    text = "Rate",
                                                    fontSize = 26.sp, color = Color.White,
                                                    modifier = Modifier,
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Popular exercises", fontSize = 30.sp, color = Color.White)
                Text(text = "See all>", fontSize = 16.sp, color = Color.White)
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth().padding(15.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Red)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Red)
                                .padding(10.dp)
                        ) {
                            Column {
                                Text(
                                    text = "Bicycle crunches",
                                    fontSize = 30.sp,
                                    color = Color.White
                                )
                                Text(
                                    text = "Chose your level & get started tofay!",
                                    fontSize = 18.sp,
                                    color = Color.Black, modifier = Modifier.width(200.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Card(
                                    modifier = Modifier
                                        .size(70.dp)
                                        .clip(CircleShape),
                                    shape = RoundedCornerShape(15.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(color = Color(0xFFAC4024)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.top),
                                            contentDescription = ""
                                        )
                                    }
                                }
                            }
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Red)
                                .padding(start = 10.dp)
                        ) {
                            Text(text = "Levels", fontSize = 30.sp, color = Color.White)
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 10.dp),

                                ) {
                                Card(
                                    modifier = Modifier
                                        .padding(top = 10.dp, end = 10.dp)
                                        .width(50.dp)
                                        .height(150.dp),
                                    shape = RoundedCornerShape(10.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceAround

                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .background(color = Color(0xFFAC4024)),
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            Column(
                                                modifier = Modifier.fillMaxSize(),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.check_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                                                    contentDescription = ""
                                                )
                                                Text(text = "01", fontSize = 24.sp)
                                            }
                                        }

                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 10.dp, end = 10.dp)
                                        .width(50.dp)
                                        .height(150.dp),
                                    shape = RoundedCornerShape(10.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceAround
                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .background(color = Color(0xFFAC4024)),
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            Column(
                                                modifier = Modifier.fillMaxSize(),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.check_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                                                    contentDescription = ""
                                                )
                                                Text(text = "02", fontSize = 24.sp)
                                            }
                                        }

                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 10.dp, end = 10.dp)
                                        .width(50.dp)
                                        .height(150.dp),
                                    shape = RoundedCornerShape(10.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceAround
                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .background(color = Color(0xFFAC4024)),
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            Column(
                                                modifier = Modifier.fillMaxSize(),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.check_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                                                    contentDescription = ""
                                                )
                                                Text(text = "03", fontSize = 24.sp)
                                            }
                                        }

                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 10.dp, end = 10.dp)
                                        .width(50.dp)
                                        .height(150.dp),
                                    shape = RoundedCornerShape(10.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceAround
                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .background(color = Color(0xFFAC4024)),
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            Column(
                                                modifier = Modifier.fillMaxSize(),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.check_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                                                    contentDescription = ""
                                                )
                                                Text(text = "04", fontSize = 24.sp)
                                            }
                                        }

                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 10.dp, end = 10.dp)
                                        .width(50.dp)
                                        .height(150.dp),
                                    shape = RoundedCornerShape(10.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceAround
                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .background(color = Color(0xFFE47558)),
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            Column(
                                                modifier = Modifier.fillMaxSize(),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.check_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                                                    contentDescription = ""
                                                )
                                                Text(text = "05", fontSize = 24.sp)
                                            }
                                        }

                                    }
                                }
                                Card(
                                    modifier = Modifier
                                        .padding(top = 10.dp)
                                        .width(50.dp)
                                        .height(150.dp),
                                    shape = RoundedCornerShape(10.dp)
                                ) {

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceAround
                                    ) {

                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .background(color = Color(0xFFE47558)),
                                            contentAlignment = Alignment.BottomCenter,
                                        ) {
                                            Column(
                                                modifier = Modifier.fillMaxSize(),
                                                horizontalAlignment = Alignment.CenterHorizontally,
                                                verticalArrangement = Arrangement.SpaceBetween
                                            ) {
                                                Image(
                                                    painter = painterResource(R.drawable.check_24dp_e8eaed_fill0_wght400_grad0_opsz24),
                                                    contentDescription = ""
                                                )
                                                Text(text = "06", fontSize = 24.sp)
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth().padding(start = 15.dp, end = 15.dp)
                    .height(90.dp),
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(), shape = RoundedCornerShape(20.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color(0xFF4C60C2)),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Triceps dips",
                            fontSize = 30.sp,
                            color = Color.White,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                        Card(
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .size(70.dp)
                                .clip(CircleShape),
                            shape = RoundedCornerShape(15.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = Color(0xFF374A8F)),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.minus),
                                    contentDescription = ""
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}