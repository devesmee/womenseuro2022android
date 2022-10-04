package com.devesmee.womenseuro2022.models

data class Match(
    val date : String,
    val homeTeam : Countries,
    val awayTeam : Countries,
    val score : String,
    val tournamentStage : TournamentStage,
)
