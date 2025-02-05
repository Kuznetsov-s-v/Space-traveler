package com.stargalaxy.spacetraveler

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.microsoft.fluent.mobile.icons.R
import com.stargalaxy.spacetraveler.ui.screens.tours.views.TabsCard
import com.stargalaxy.spacetraveler.ui.screens.tours.views.TourCard
import com.stargalaxy.spacetraveler.ui.screens.tours.views.TourPageViewDisplay
import com.stargalaxy.spacetraveler.ui.screens.tours.views.ToursViewDisplay
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme
import com.stargalaxy.spacetraveler.ui.theme.components.JetIconButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                SpaceTravelerTheme(darkTheme = false, dynamicColor = false) {
/*                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        JetIconButton(
                            vectorDrawableId = R.drawable.ic_fluent_chevron_left_16_filled,
                            modifier = Modifier.size(48.dp),
                            shape = RoundedCornerShape(CornerSize(8.dp)),
                            contentPadding = PaddingValues(12.dp),
                            onClick = { println(" ! ") }
                        )
                    }*/
                    /*Box(
                        modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 200.dp).size(350.dp,290.dp)

                    ) {
                        TabsCard(
                            description = "Раз в год на плато под мировой скалой с небес сходит живой огонь.\n" +
                                    "\n" +
                                    "Только самые удачливые путники видели это чудо природы!\n" +
                                    "\n" +
                                    "Готов ли ты стать одним из них?",
                            reviews = listOf("321"),
                            modifier = Modifier
                                .padding(start = 24.dp, end = 24.dp, top = 12.dp, bottom = 51.dp)
                        )
                    }*/
                    TourPageViewDisplay()
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