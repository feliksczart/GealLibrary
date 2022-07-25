package com.example.felikslibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.annotation.ExperimentalCoilApi
import com.example.felikslibrary.ui.theme.FeliksLibraryTheme
import com.example.geal_list_item.Geal
import com.example.geal_list_item.GealListItem
import kotlin.random.Random

@ExperimentalCoilApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeliksLibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GealListItem(
                        geal = Geal(
                            id = "GEA",
                            name = "Geal",
                            description = "Geal description",
                            imageUrl = "https://picsum.photos/seed/${Random.nextInt()}/300/200"
                        ),
                        onItemClick = {}
                    )
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
    FeliksLibraryTheme {
        Greeting("Android")
    }
}