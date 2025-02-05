package com.stargalaxy.spacetraveler.ui.screens.tours.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.microsoft.fluent.mobile.icons.R
import com.stargalaxy.spacetraveler.ui.theme.components.JetIconButton
import com.stargalaxy.spacetraveler.ui.theme.components.JetRatingBar
import com.stargalaxy.spacetraveler.ui.theme.components.JetTextButton
import com.stargalaxy.spacetraveler.ui.theme.fonts

@Composable
fun TourPageViewDisplay(){
    val imagePath = "file:///android_asset/F_Tour1.png"
    val label = "Экологический туризм"
    val rating = 3.3
    val description_ = "Раз в год на плато под мировой скалой с небес сходит живой огонь.\n" +
            "\n" +
            "Только самые удачливые путники видели это чудо природы!\n" +
            "\n" +
            "Готов ли ты стать одним из них?"
    val reviews_ = listOf("321")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
            .verticalScroll(rememberScrollState())
            .padding(start = 32.dp, top = 32.dp, end = 32.dp, bottom = 32.dp)
    ){
        Row(verticalAlignment = Alignment.CenterVertically){
            JetIconButton(
                vectorDrawableId = R.drawable.ic_fluent_chevron_left_16_filled,
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(CornerSize(8.dp)),
                contentPadding = PaddingValues(12.dp),
                onClick = { println(" ! ") }
            )
            Text(
                text = "Живой огонь",
                color = Color(0xFF282828).copy(0.85f),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f),
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    lineHeight = 28.13.sp,
                )
            )
            Icon (
                painter = painterResource(id = R.drawable.ic_fluent_alert_24_regular),
                contentDescription = "Icon button",
                tint = MaterialTheme.colorScheme.secondary
            )
        }
        Spacer(modifier = Modifier.padding(bottom = 24.dp))
        Column(
            Modifier,
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            AsyncImage(
                model = imagePath,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(8f / 3f)
                    .heightIn(min = 136.dp)
                    .clip(RoundedCornerShape(64.dp))
                    //.border(3.dp, MaterialTheme.colorScheme.surface, RoundedCornerShape(32.dp)),
                ,
                contentScale = ContentScale.Crop
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(25.dp, 10.dp)
            ) {
                Text(
                    text = label,
                    style = TextStyle(
                        fontFamily = fonts,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        lineHeight = 16.41.sp,
                    ),
                    color = MaterialTheme.colorScheme.onSurface,
                )
                Spacer(modifier = Modifier.weight(1f))
                JetRatingBar(
                    rating = rating.toInt(),
                    modifier = Modifier
                )
            }
        }
        Spacer(modifier = Modifier.padding(bottom = 32.dp))
        TabsCard(
            description = description_,
            reviews = reviews_,
            modifier = Modifier
        )
        Spacer(modifier = Modifier.weight(1f))
        JetTextButton(
            text = stringResource(com.stargalaxy.spacetraveler.R.string.send_application_button),
            modifier = Modifier.fillMaxHeight(),
            shape = RoundedCornerShape(24.dp),
            contentPadding = PaddingValues(10.dp),
            onClick = { println(" ! ")}
        )
    }
}