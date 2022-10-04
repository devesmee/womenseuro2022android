package com.devesmee.womenseuro2022.models

data class Stadium(
    val name: String,
    val city: String,
    val latitude: Double,
    val longitude: Double,
    val matches: List<Match>
)
