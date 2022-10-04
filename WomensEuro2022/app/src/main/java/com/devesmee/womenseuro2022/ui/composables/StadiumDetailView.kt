package com.devesmee.womenseuro2022.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.devesmee.womenseuro2022.R
import com.devesmee.womenseuro2022.models.Match
import com.devesmee.womenseuro2022.models.Stadium
import com.devesmee.womenseuro2022.models.TournamentStage
import com.google.gson.Gson

@Composable
fun StadiumDetailView(
    stadiumJSON: String
) {
    val stadium = Gson().fromJson(stadiumJSON, Stadium::class.java)
    val groupStageMatches: List<Match> = remember {
        stadium.matches.filter { match -> match.tournamentStage == TournamentStage.GROUPSTAGE }
    }
    val quarterFinalMatches: List<Match> = remember {
        stadium.matches.filter { match -> match.tournamentStage == TournamentStage.QUARTERFINAL }
    }
    val semiFinalMatches: List<Match> = remember {
        stadium.matches.filter { match -> match.tournamentStage == TournamentStage.SEMIFINAL }
    }
    val finalMatches: List<Match> = remember {
        stadium.matches.filter { match -> match.tournamentStage == TournamentStage.FINAL }
    }

    Column(
        modifier = Modifier.background(Color.Black)
    ) {
        StadiumInfo(stadium)
        if (groupStageMatches.isNotEmpty()) {
            Column {
                Text(
                    text = "Group stage",
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp)
                )
                LazyColumn(
                    modifier = Modifier.background(colorResource(id = R.color.dark_purple))
                ) {
                    items(groupStageMatches) { match ->
                        MatchListRow(match)
                        Divider(
                            color = Color.DarkGray,
                            thickness = 0.5.dp
                        )
                    }
                }
            }
        }
        if (quarterFinalMatches.isNotEmpty()) {
            Column {
                Text(
                    text = "Quarter-finals",
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp)
                )
                LazyColumn(
                    modifier = Modifier.background(colorResource(id = R.color.dark_purple))
                ) {
                    items(quarterFinalMatches) { match ->
                        MatchListRow(match)
                        Divider(
                            color = Color.DarkGray,
                            thickness = 0.5.dp
                        )
                    }
                }
            }
        }
        if (semiFinalMatches.isNotEmpty()) {
            Column {
                Text(
                    text = "Semi-finals",
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp)
                )
                LazyColumn(
                    modifier = Modifier.background(colorResource(id = R.color.dark_purple))
                ) {
                    items(semiFinalMatches) { match ->
                        MatchListRow(match)
                        Divider(
                            color = Color.DarkGray,
                            thickness = 0.5.dp
                        )
                    }
                }
            }
        }
        if (finalMatches.isNotEmpty()) {
            Column {
                Text(
                    text = "Final",
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 5.dp)
                )
                LazyColumn(
                    modifier = Modifier.background(colorResource(id = R.color.dark_purple))
                ) {
                    items(finalMatches) { match ->
                        MatchListRow(match)
                        Divider(
                            color = Color.DarkGray,
                            thickness = 0.5.dp
                        )
                    }
                }
            }
        }
    }
}