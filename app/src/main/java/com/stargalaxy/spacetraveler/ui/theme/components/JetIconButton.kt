package com.stargalaxy.spacetraveler.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.microsoft.fluent.mobile.icons.R.drawable
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme


@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .clip(shape = shape)
            .background(color = Color(0xFFA5A5A5).copy(0.1f))
            .clickable(onClick = onClick)
            .padding(contentPadding)
    ){
        Icon (
            painter = painterResource(id = vectorDrawableId),
            contentDescription = "Icon button",
            tint = MaterialTheme.colorScheme.onSurface
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun JetIconButtonPreview() {
    SpaceTravelerTheme(darkTheme = false, dynamicColor = false, ) {
            JetIconButton(
                vectorDrawableId = drawable.ic_fluent_chevron_left_16_filled,
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(CornerSize(8.dp)),
                contentPadding = PaddingValues(12.dp),
                onClick = { println(" ! ") }
            )
    }
}
