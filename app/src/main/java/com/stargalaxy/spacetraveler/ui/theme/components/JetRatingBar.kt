package com.stargalaxy.spacetraveler.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.microsoft.fluent.mobile.icons.R
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme

@Composable
fun JetRatingBar(
    rating: Int,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(3.dp)
    ) {
        for (i in 1..5) {
            Icon(
                painter = if (i <= rating) {
                    painterResource(id = R.drawable.ic_fluent_star_16_filled)
                } else {
                    painterResource(id = R.drawable.ic_fluent_star_16_filled)
                },
                tint = if (i <= rating) {
                    MaterialTheme.colorScheme.secondary
                } else {
                    MaterialTheme.colorScheme.onSurface
                },
                contentDescription = "Star $i",
                modifier = Modifier
                    .size(16.dp)
                    .padding(start = 1.5.dp, end = 1.5.dp, top = 1.6.dp, bottom = 1.95.dp)
            )
        }
    }
}

@Preview
@Composable
fun JetRatingBarPreview() {
    SpaceTravelerTheme(darkTheme = false, dynamicColor = false, ) {
        JetRatingBar(rating = 3, modifier = Modifier)
    }
}