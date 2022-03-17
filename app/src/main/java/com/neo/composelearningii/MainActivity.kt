package com.neo.composelearningii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.neo.composelearningii.ui.theme.ComposeLearningIITheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            LazyColumn(
                modifier = Modifier
                    .scrollable(
                        orientation = Orientation.Vertical,
                        enabled = true,
                        state = rememberLazyListState(),
                    )
                    .background(
                        color = Color(color = 0xFFF2F2F2)
                    )
                    .fillMaxHeight()
                    .fillMaxWidth()

            ) {
                item {

                    Column() {
                        Image(
                            bitmap = ImageBitmap.imageResource(
                                id = R.drawable.happy_meal_small
                            ),
                            modifier = Modifier.height(300.dp),
                            contentDescription = "Happy meal",
                            contentScale = ContentScale.Crop

                        )
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Happy Meal",
                                style = TextStyle(
                                    fontSize = 26.sp
                                )
                            )
                            Spacer(modifier = Modifier.padding(top = 10.dp))
                            Text(
                                text = "800 Calories",
                                style = TextStyle(
                                    fontSize =  15.sp
                                )
                            )
                            Spacer(modifier = Modifier.padding(top = 10.dp))
                            Text(
                                text = "$5.99",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    color = Color.Blue
                                )
                            )
                        }
                    }
                }
            }
        }

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeLearningIITheme {
        Greeting("Android")
    }
}