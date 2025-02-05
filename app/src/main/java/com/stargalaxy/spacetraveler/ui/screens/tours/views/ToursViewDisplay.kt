package com.stargalaxy.spacetraveler.ui.screens.tours.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stargalaxy.spacetraveler.ui.theme.fonts
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import com.stargalaxy.spacetraveler.R

@Composable
fun ToursViewDisplay(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.unique_offers_title),
            color = Color(0xFF282828),
            style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                lineHeight = 23.44.sp,
                letterSpacing = 0.sp,
            )
        )
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        TourCard(
            modifier = Modifier,
            name = "Живой огонь",
            description = "Экологический туризм",
            imagePath = "file:///android_asset/Tour1.jpg",
            rating = 4.1,
            reviews = 177,
            isNew = true
        )
        Spacer(modifier = Modifier.padding(bottom = 16.dp))
        TourCard(
            modifier = Modifier,
            name = "Пирамиды стек...",
            description = "Исторический туризм",
            imagePath = "file:///android_asset/Tour2.jpg",
            rating = 5.0,
            reviews = 61,
            isNew = false
        )
        Spacer(modifier = Modifier.padding(bottom = 16.dp))
        TourCard(
            modifier = Modifier,
            name = "Водный мир",
            description = "Археологический туризм",
            imagePath = "file:///android_asset/Tour3.jpg",
            rating = 5.0,
            reviews = 13,
            isNew = false
        )
        Spacer(modifier = Modifier.padding(bottom = 32.dp))
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(color = MaterialTheme.colorScheme.surface),
        ){
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 12.dp, bottom  = 6.dp),
                text = stringResource(R.string.description),
                color = MaterialTheme.colorScheme.onSurface,
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    lineHeight = 17.58.sp,
                    letterSpacing = 0.sp,
                )
            )
            Text(
                modifier = Modifier.padding(start = 23.dp, end = 15.dp, bottom = 50.dp),
                text = stringResource(R.string.company_letter) + "\n\n" +
                       stringResource(R.string.company_letter2) + "\n\n" +
                       stringResource(R.string.company_letter3),
                color = MaterialTheme.colorScheme.onSurface,
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    lineHeight = 16.41.sp,
                    letterSpacing = 0.sp,
                )
            )
        }
    }
}