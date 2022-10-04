package com.devesmee.womenseuro2022.models

import com.google.gson.annotations.SerializedName

enum class TournamentStage(val stage: String) {
    @SerializedName("Group stage")
    GROUPSTAGE("Group stage"),
    @SerializedName("Quarter-finals")
    QUARTERFINAL("Quarter-finals"),
    @SerializedName("Semi final")
    SEMIFINAL("Semi final"),
    @SerializedName("Final")
    FINAL("Final")
}