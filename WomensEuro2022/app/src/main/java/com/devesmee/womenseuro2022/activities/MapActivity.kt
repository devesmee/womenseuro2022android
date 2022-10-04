package com.devesmee.womenseuro2022.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.devesmee.womenseuro2022.models.Stadium
import com.devesmee.womenseuro2022.ui.composables.MapView
import com.devesmee.womenseuro2022.ui.theme.WomensEuro2022Theme
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.osmdroid.config.Configuration

class MapActivity : ComponentActivity() {
    lateinit var stadiums: List<Stadium>
    private val jsonString: String
        get() = applicationContext.assets.open("data.json").bufferedReader().use {
            it.readText()
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getData(jsonString)

        Configuration.getInstance().userAgentValue = packageName

        setContent {
            WomensEuro2022Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MapView(stadiums = stadiums)
                }
            }
        }
    }

    private fun getData(jsonString: String) {
        val stadiumListType = object : TypeToken<List<Stadium>>() {}.type
        stadiums = Gson().fromJson(jsonString, stadiumListType)
    }
}