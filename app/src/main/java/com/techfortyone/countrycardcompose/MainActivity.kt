package com.techfortyone.countrycardcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.techfortyone.countrycardcompose.ui.theme.CountryCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountryCardComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun CountryCardInfo() {
    Surface(
        modifier = Modifier
            .fillMaxWidth(1.0f)
            .padding(12.dp)
            .wrapContentHeight(align = Alignment.Top)
            .border(1.dp, Color.LightGray),
        shadowElevation = 2.dp
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.2f)
                    .weight(0.2f)
            ) {
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(70.dp),
                    contentAlignment = Alignment.Center
                ) {
                    val imgResid = R.drawable.inflag
                    val imgPainter = painterResource(id = imgResid)
                    Image(
                        painter = imgPainter, contentDescription = "flag",
                        contentScale = ContentScale.Crop
                    )

                }
                Text(
                    text = "India",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "New Delhi",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(2.dp),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .weight(0.8f)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Republic of India", modifier = Modifier.fillMaxWidth().padding(10.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Asia", modifier = Modifier.fillMaxWidth().padding(5.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "South Asia", modifier = Modifier.fillMaxWidth().padding(5.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                }

                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "rupee", modifier = Modifier.padding(5.dp),
                        textAlign = TextAlign.Left,
                        fontSize = 15.sp
                    )
                    Text(
                        text = "Indian rupee", modifier = Modifier.padding(5.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp
                    )
                    Text(
                        text = "+91", modifier = Modifier.padding(5.dp),
                        textAlign = TextAlign.Right,
                        fontSize = 15.sp
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    CountryCardComposeTheme {
        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            CountryCardInfo()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    CountryCardComposeTheme {
        MainScreen()
    }
}