package com.stargalaxy.spacetraveler.ui.screens.tours.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.stargalaxy.spacetraveler.R
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme
import com.stargalaxy.spacetraveler.ui.theme.TourCardTypography
import com.stargalaxy.spacetraveler.ui.theme.components.JetRatingBar

/*
modifier: Modifier - для персонализации UI-компонента (например, определение размера);
name: String - название тура;
description: String - описание к туру;
imagePath: String - путь до изображения для тура;
rating: Double - рейтинг тура на основе отзывов;
reviews: Int - количество отзывов о туре;
isNew: Boolean - является ли тур новым.
 */

@Composable
fun TourCard(
    modifier: Modifier,
    name: String,
    description: String,
    imagePath: String,
    rating: Double,
    reviews: Int,
    isNew: Boolean,
){
    Box(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.surface)
            .clip(RoundedCornerShape(bottomStart = 8.dp, topEnd = 12.dp)),
        contentAlignment = Alignment.TopEnd
    ) {
        if (isNew) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(bottomStart = 8.dp, topEnd = 12.dp))
                    .background(color = Color(0XFF56CB03)),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.new_button),
                    color = MaterialTheme.colorScheme.surface,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(
                        bottom = 5.dp,
                        top = 5.dp,
                        start = 13.dp,
                        end = 12.dp
                    ),
                    style = TourCardTypography.labelSmall
                )
            }
        }
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ){
            AsyncImage(
                model = imagePath,
                contentDescription = "",
                modifier = Modifier
                    //.fillMaxWidth()
                    //.aspectRatio(1f / 1f)

                    .heightIn(min = 64.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .padding(16.dp),
                    //.border(3.dp, MaterialTheme.colorScheme.surface, RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = name,
                    color = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.padding(top = 17.dp),
                    textAlign = TextAlign.Center,
                    style = TourCardTypography.bodyLarge
                )
                Text(
                    text = description,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(start = 1.dp, top = 4.dp, bottom = 7.dp),
                    textAlign = TextAlign.Center,
                    style = TourCardTypography.labelMedium
                )
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    JetRatingBar(rating = rating.toInt(), modifier = Modifier)
                    Text(
                        text = description,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(start = 1.dp, top = 4.dp, bottom = 7.dp),
                        textAlign = TextAlign.Center,
                        style = TourCardTypography.labelMedium
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun JetRatingBarPreview() {
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
