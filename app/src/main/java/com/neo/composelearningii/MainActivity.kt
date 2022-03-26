package com.neo.composelearningii

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.neo.composelearningii.ui.theme.ComposeLearningIITheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.main_nav_host, RecipeListFragment())
//            .commit()

        
//        setContent {
//            LazyColumn(
//                modifier = Modifier
//                    .scrollable(
//                        orientation = Orientation.Vertical,
//                        enabled = true,
//                        state = rememberLazyListState(),
//                    )
//                    .background(
//                        color = Color(color = 0xFFF2F2F2)
//                    )
//                    .fillMaxHeight()
//                    .fillMaxWidth()
//
//            ) {
//                item {
//
//                    Column() {
//                        Image(
//                            bitmap = ImageBitmap.imageResource(
//                                id = R.drawable.happy_meal_small
//                            ),
//                            modifier = Modifier.height(300.dp),
//                            contentDescription = "Happy meal",
//                            contentScale = ContentScale.Crop
//
//                        )
//                        Column(modifier = Modifier.padding(16.dp)) {
//                            Row(
//                                horizontalArrangement = Arrangement.SpaceBetween,
//                                modifier = Modifier.fillMaxWidth()
//                            ) {
//                                Text(
//                                    text = "Happy Meal",
//                                    style = TextStyle(
//                                        fontSize = 26.sp
//                                    )
//                                )
//                                Text(
//
//                                    modifier = Modifier.align(
//                                        Alignment.CenterVertically
//                                    ),
//                                    text = "$5.99",
//                                    style = TextStyle(
//                                        fontSize = 12.sp,
//                                        color = Color.Blue
//                                    )
//                                )
//                            }
//
//                            Spacer(modifier = Modifier.padding(top = 10.dp))
//                            Text(
//                                text = "800 Calories",
//                                style = TextStyle(
//                                    fontSize =  15.sp
//                                )
//                            )
//                            Spacer(modifier = Modifier.padding(top = 30.dp))
//                            Row(
//
//                                horizontalArrangement = Arrangement.Center,
//                                modifier = Modifier.fillMaxWidth()
//                            ) {
//                                Button(onClick = { /*TODO*/ }) {
//                                    Text(text = "Order Now")
//                                }
//                            }
//
//                        }
//                    }
//                }
//            }
//        }

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