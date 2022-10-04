package com.devesmee.womenseuro2022.models

import com.google.gson.annotations.SerializedName

enum class TournamentStage() {
    @SerializedName("Group stage")
    GROUPSTAGE,
    @SerializedName("Quarter-finals")
    QUARTERFINAL,
    @SerializedName("Semi final")
    SEMIFINAL,
    @SerializedName("Final")
    FINAL
}