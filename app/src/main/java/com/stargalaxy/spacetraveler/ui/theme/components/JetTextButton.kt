package com.stargalaxy.spacetraveler.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stargalaxy.spacetraveler.R
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme
import com.stargalaxy.spacetraveler.ui.theme.fonts

@Composable
fun JetTextButton(
    text: String,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = shape)
            .background(color = MaterialTheme.colorScheme.secondary.copy(0.5f))
            .clickable(onClick = onClick)
            .padding(contentPadding),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                bottom = 5.dp,
                top = 5.dp,
                start = 13.dp,
                end = 12.dp
            ),
            style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                lineHeight = 18.75.sp,
                //letterSpacing = 0.5.sp
            )
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun JetTextButtonPreview() {
    SpaceTravelerTheme(darkTheme = false, dynamicColor = false, ) {
        JetTextButton(
            text = stringResource(R.string.send_application_button),
            modifier = Modifier,
            shape = RoundedCornerShape(24.dp),
            contentPadding = PaddingValues(10.dp),
            onClick = { println(" ! ")}
        )
    }
}
