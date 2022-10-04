package com.devesmee.womenseuro2022.extensions

import com.devesmee.womenseuro2022.models.Match
import com.devesmee.womenseuro2022.models.TournamentStage

fun List<Match>.groupStage(): List<Match> {
    return filter { it.tournamentStage == TournamentStage.GROUPSTAGE }
}

fun List<Match>.quarterFinal(): List<Match> {
    return filter { it.tournamentStage == TournamentStage.QUARTERFINAL }
}

fun List<Match>.semiFinal(): List<Match> {
    return filter { it.tournamentStage == TournamentStage.SEMIFINAL }
}

fun List<Match>.final(): List<Match> {
    return filter { it.tournamentStage == TournamentStage.FINAL }
}