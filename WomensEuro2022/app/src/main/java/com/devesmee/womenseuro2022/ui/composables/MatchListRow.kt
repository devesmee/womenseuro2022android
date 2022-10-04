package com.devesmee.womenseuro2022.ui.composables

import android.graphics.Paint.Align
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devesmee.womenseuro2022.R
import com.devesmee.womenseuro2022.models.*
import com.google.gson.Gson

@Composable
fun MatchListRow(
    match: Match,
) {
    Log.e("match: ", match.toString())

    Column(
        modifier = Modifier.padding(vertical = 10.dp)
    ) {
        Text(
            text = match.date,
            color = Color.White,
            fontStyle = FontStyle.Italic,
            fontSize = 14.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Box(
            modifier = Modifier.padding(horizontal = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(35.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = match.score,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        determineCorrectCountryDrawable(country = match.homeTeam),
                        match.homeTeam.country,
                        modifier = Modifier
                            .size(35.dp, 35.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = match.homeTeam.country,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = match.awayTeam.country,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(end = 5.dp)
                    )
                    Image(
                        determineCorrectCountryDrawable(country = match.awayTeam),
                        match.awayTeam.country,
                        modifier = Modifier
                            .size(35.dp, 35.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}

@Composable
private fun determineCorrectCountryDrawable(country: Countries): Painter {
    return when(country) {
        Countries.AUSTRIA -> painterResource(id = R.drawable.austria)
        Countries.BELGIUM -> painterResource(id = R.drawable.belgium)
        Countries.DENMARK -> painterResource(id = R.drawable.denmark)
        Countries.ENGLAND -> painterResource(id = R.drawable.england)
        Countries.FINLAND -> painterResource(id = R.drawable.finland)
        Countries.FRANCE -> painterResource(id = R.drawable.france)
        Countries.GERMANY -> painterResource(id = R.drawable.germany)
        Countries.ICELAND -> painterResource(id = R.drawable.iceland)
        Countries.ITALY -> painterResource(id = R.drawable.italy)
        Countries.NETHERLANDS -> painterResource(id = R.drawable.netherlands)
        Countries.NORTHERN_IRELAND -> painterResource(id = R.drawable.northern_ireland)
        Countries.NORWAY -> painterResource(id = R.drawable.norway)
        Countries.PORTUGAL -> painterResource(id = R.drawable.portugal)
        Countries.SPAIN -> painterResource(id = R.drawable.spain)
        Countries.SWEDEN -> painterResource(id = R.drawable.sweden)
        Countries.SWITZERLAND -> painterResource(id = R.drawable.switzerland)
    }
}

@Preview
@Composable
fun MatchListRow_Preview() {
    val exampleMatch = Match(date= "11 July 2022", homeTeam = Countries.AUSTRIA, awayTeam = Countries.NORTHERN_IRELAND, score = "2 - 0", tournamentStage = TournamentStage.GROUPSTAGE)
    MatchListRow(match = exampleMatch)
}