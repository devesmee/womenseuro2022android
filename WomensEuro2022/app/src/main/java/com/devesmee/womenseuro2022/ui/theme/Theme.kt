package com.devesmee.womenseuro2022.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.devesmee.womenseuro2022.R

@Composable
fun WomensEuro2022Theme(
    content: @Composable () -> Unit
) {
    val darkColorPalette = darkColors(
        primary = colorResource(id = R.color.dark_purple),
        secondary = colorResource(id = R.color.black)
    )

    MaterialTheme(
        colors = darkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content,
    )
}