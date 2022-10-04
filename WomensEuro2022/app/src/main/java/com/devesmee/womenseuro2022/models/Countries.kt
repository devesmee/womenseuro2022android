package com.devesmee.womenseuro2022.models

import com.google.gson.annotations.SerializedName

enum class Countries(val country: String) {
    @SerializedName("Austria")
    AUSTRIA("Austria"),
    @SerializedName("Belgium")
    BELGIUM("Belgium"),
    @SerializedName("Denmark")
    DENMARK("Denmark"),
    @SerializedName("England")
    ENGLAND("England"),
    @SerializedName("Finland")
    FINLAND("Finland"),
    @SerializedName("France")
    FRANCE("France"),
    @SerializedName("Germany")
    GERMANY("Germany"),
    @SerializedName("Iceland")
    ICELAND("Iceland"),
    @SerializedName("Italy")
    ITALY("Italy"),
    @SerializedName("Northern Ireland")
    NORTHERN_IRELAND("Northern Ireland"),
    @SerializedName("Netherlands")
    NETHERLANDS("Netherlands"),
    @SerializedName("Norway")
    NORWAY("Norway"),
    @SerializedName("Portugal")
    PORTUGAL("Portugal"),
    @SerializedName("Spain")
    SPAIN("Spain"),
    @SerializedName("Sweden")
    SWEDEN("Sweden"),
    @SerializedName("Switzerland")
    SWITZERLAND("Switzerland"),
}