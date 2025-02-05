package com.stargalaxy.spacetraveler.ui.screens.tours.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
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
import com.stargalaxy.spacetraveler.ui.utils.advancedShadow

@Composable
fun getReviewForm(number: Int): String {
    return when {
        number % 10 == 1 && number % 100 != 11 -> stringResource(R.string.review_)
        number % 10 in 2..4 && number % 100 !in 12..14 -> stringResource(R.string.review_a_)
        else -> stringResource(R.string.reviews_)
    }
}

@Composable
fun TourCard(
    modifier: Modifier = Modifier,
    name: String,
    description: String,
    imagePath: String,
    rating: Double,
    reviews: Int,
    isNew: Boolean,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 96.dp)
            .padding(5.dp)
            .advancedShadow(
                alpha =  0.05f,
                shadowBlurRadius = 5.dp,
                offsetY = 4.dp,
                offsetX = 1.dp
            )
            .clip(RoundedCornerShape(12.dp))
            .background(color = MaterialTheme.colorScheme.surface),
    ) {
        if (isNew) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            ) {
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
        }

        Row(
            modifier = Modifier
                .padding(16.dp)
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .advancedShadow(
                        alpha =  0.2f,
                        cornersRadius = 16.dp,
                        shadowBlurRadius = 5.dp,
                        offsetY = 4.dp,
                        offsetX = 1.dp
                    )
                    .clip(RoundedCornerShape(16.dp))
                    .width(64.dp)
                    .fillMaxHeight()

            ) {
                AsyncImage(
                    model = imagePath,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .aspectRatio(1f)
                )
            }

            Column(
                modifier = Modifier.padding(start = 16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = name,
                    color = Color(0xFF282828), //MaterialTheme.colorScheme.onPrimary,
                    textAlign = TextAlign.Start,
                    style = TourCardTypography.bodyLarge
                )
                Text(
                    text = description,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.padding(top = 4.dp, bottom = 7.dp),
                    textAlign = TextAlign.Start,
                    style = TourCardTypography.labelMedium
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    JetRatingBar(rating = rating.toInt(), modifier = Modifier)
                    Text(
                        text = "$rating | $reviews ${getReviewForm(reviews)}",
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(start = 4.dp),
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
            reviews = 165,
            isNew = true
        )
    }
}
