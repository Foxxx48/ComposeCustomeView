package com.foxxx.composecustomeview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.foxxx.composecustomeview.ui.theme.ComposeCustomeViewTheme


@Composable
fun CanvasEx() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(size.width, size.height),
            strokeWidth = 5.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(size.width, size.height),
            end = Offset(0f, size.height),
            strokeWidth = 5.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(size.width, size.height),
            end = Offset(size.width, 0f),
            strokeWidth = 5.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            strokeWidth = 5.dp.toPx()
        )

        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = Offset(0f, size.height),
            strokeWidth = 5.dp.toPx()
        )
        drawLine(
            color = Color.White,
            start = Offset(0f, size.height),
            end = Offset(size.width, 0f),
            strokeWidth = 5.dp.toPx()
        )

        drawCircle(
            color = Color.White,
            radius = 100.dp.toPx(),
            style = Stroke(
                width = 5.dp.toPx()
            )

        )
    }
}

@Preview
@Composable
fun ComposeCustomeViewDarkTheme() {
    ComposeCustomeViewTheme(
        darkTheme = true
    ) {
        CanvasEx()
    }
}




