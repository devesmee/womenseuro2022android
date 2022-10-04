package com.devesmee.womenseuro2022.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.devesmee.womenseuro2022.ui.composables.StadiumDetailView
import com.devesmee.womenseuro2022.ui.theme.WomensEuro2022Theme

class StadiumActivity : ComponentActivity() {
    private lateinit var selectedStadiumJSON: String

    override fun onCreate(savedInstanceState: Bundle?) {
        selectedStadiumJSON = intent.getStringExtra("stadium").toString()
        super.onCreate(savedInstanceState)

        setContent {
            WomensEuro2022Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    StadiumDetailView(stadiumJSON = selectedStadiumJSON)
                }
            }
        }
    }
}