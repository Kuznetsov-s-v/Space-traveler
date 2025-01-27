package com.stargalaxy.spacetraveler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.stargalaxy.spacetraveler.ui.screens.tours.views.TourCard
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                SpaceTravelerTheme(darkTheme = false, dynamicColor = false, ) {
                    TourCard(
                        modifier = Modifier,
                        name = "Живой огонь",
                        description = "Экологический туризм",
                        imagePath = "file:///android_asset/Tour1.jpg",
                        rating = 3.0,
                        reviews = 0,
                        isNew = true
                    )
                }
            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SpaceTravelerTheme {
        Greeting("Android")
    }
}