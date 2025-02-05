package com.stargalaxy.spacetraveler.ui.screens.tours.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.microsoft.fluent.mobile.icons.R
import com.stargalaxy.spacetraveler.ui.theme.SpaceTravelerTheme
import com.stargalaxy.spacetraveler.ui.theme.fonts
import com.stargalaxy.spacetraveler.ui.utils.dashedBorder

@Composable
fun TabsCard(
    description: String,
    reviews: List<String>,
    modifier: Modifier
){
    Box(){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surface),
            contentAlignment = Alignment.TopStart
        ){ // Описание
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(MaterialTheme.colorScheme.background)
                    .size(72.dp,87.dp)
            ){
                Icon (
                    painter = painterResource(id = R.drawable.ic_fluent_book_open_globe_24_filled),
                    contentDescription = "describe",
                    tint = Color(0xFF5694F0).copy(0.5f),
                    modifier = Modifier
                        .padding(start = 24.dp,end = 24.dp, top = 12.dp)
                        .size(24.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.TopEnd
        ){ // Отзывы
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .border(width = 2.dp, color = MaterialTheme.colorScheme.background, shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp) )
                    .size(72.dp,87.dp)
            ){
                Icon (
                    painter = painterResource(id = R.drawable.ic_fluent_book_star_24_filled),
                    contentDescription = "describe",
                    tint = Color(0xFF5694F0).copy(0.5f),
                    modifier = Modifier
                        .padding(start = 24.dp,end = 24.dp, top = 12.dp)
                        .size(24.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 34.dp)
                .clip(RoundedCornerShape(topStart = 64.dp, topEnd = 64.dp, bottomStart = 24.dp, bottomEnd = 24.dp))
                .background(color = MaterialTheme.colorScheme.surface)
                .dashedBorder(2.dp,color = Color(0xFF5694F0).copy(0.35f),shape = RoundedCornerShape(topStart = 64.dp, topEnd = 64.dp, bottomStart = 24.dp, bottomEnd = 24.dp),on = 7.dp,off = 7.dp)
                .padding(10.dp)
                .clip(RoundedCornerShape(topStart = 56.dp, topEnd = 56.dp, bottomStart = 24.dp, bottomEnd = 24.dp))
                .background(MaterialTheme.colorScheme.background),

        ){
            Text(
                text = description,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .padding(top = 69.dp, bottom = 71.dp, start = 20.dp, end = 20.dp)
                    .align(Alignment.TopCenter),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 14.06.sp,
                    //letterSpacing = 0.5.sp
                )
            )

        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun JetTextButtonPreview() {
    SpaceTravelerTheme(darkTheme = false, dynamicColor = false, ) {
        TabsCard(
            description = "Раз в год на плато под мировой скалой с небес сходит живой огонь.\n" +
                    "\n" +
                    "Только самые удачливые путники видели это чудо природы!\n" +
                    "\n" +
                    "Готов ли ты стать одним из них?",
            reviews = listOf("321"),
            modifier = Modifier
                .padding(start = 24.dp,end = 24.dp, top = 12.dp, bottom = 51.dp)
        )
    }
}