package com.devesmee.womenseuro2022.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.devesmee.womenseuro2022.R
import com.devesmee.womenseuro2022.models.Stadium
import com.google.gson.Gson

@Composable
fun StadiumInfo(
    stadium: Stadium
) {
    Box {
        Image(
            determineCorrectStadiumDrawable(stadium.name),
            "Women's Euro 2022 logo",
            Modifier.fillMaxWidth()
                    .height(200.dp),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .background(Color.Black.copy(0.5f))
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(vertical = 5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                stadium.name,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                stadium.city,
                color = Color.White
            )
        }
    }
}

@Composable
private fun determineCorrectStadiumDrawable(stadiumName: String): Painter {
    return when(stadiumName) {
        "Bramall Lane" -> painterResource(id = R.drawable.bramall_lane)
        "Brentford Community Stadium" -> painterResource(id = R.drawable.brentford_community_stadium)
        "Brighton & Hove Community Stadium" -> painterResource(id = R.drawable.brighton_hove_community_stadium)
        "Leigh Sports Village" -> painterResource(id = R.drawable.leigh_sports_village)
        "Manchester City Academy Stadium" -> painterResource(id = R.drawable.manchester_city_academy_stadium)
        "New York Stadium" -> painterResource(id = R.drawable.new_york_stadium)
        "Old Trafford" -> painterResource(id = R.drawable.old_trafford)
        "St. Mary's Stadium" -> painterResource(id = R.drawable.st_marys_stadium)
        "Stadium MK" -> painterResource(id = R.drawable.stadium_mk)
        "Wembley Stadium" -> painterResource(id = R.drawable.wembley_stadium)
        else -> painterResource(id = R.drawable.logo)
    }
}

@Preview
@Composable
fun StadiumInfo_Preview() {
    val exampleStadium = Stadium(name="Old Trafford", city="Manchester", latitude=53.46308522200754, longitude=-2.2913398114888857, matches=listOf())
    StadiumInfo(stadium = exampleStadium)
}