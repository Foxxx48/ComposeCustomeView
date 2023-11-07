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
fun CanvasEx2() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
//      O
        drawCircle(
            color = Color.White,
            radius = 40.dp.toPx(),
            style = Stroke(
                width = 5.dp.toPx()
            ),
            center = Offset(
                75.dp.toPx(), 75.dp.toPx()
            )
        )

//      L
        drawLine(
            color = Color.White,
            start = Offset(125.dp.toPx(), 115.dp.toPx()),
            end = Offset(165.dp.toPx(), 35.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )

        drawLine(
            color = Color.White,
            start = Offset(165.dp.toPx(), 35.dp.toPx()),
            end = Offset(200.dp.toPx(), 115.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )

//      E

        drawLine(
            color = Color.White,
            start = Offset(215.dp.toPx(), 115.dp.toPx()),
            end = Offset(215.dp.toPx(), 35.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )

        drawLine(
            color = Color.White,
            start = Offset(215.dp.toPx(), 115.dp.toPx()),
            end = Offset(255.dp.toPx(), 115.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )

        drawLine(
            color = Color.White,
            start = Offset(215.dp.toPx(), 75.dp.toPx()),
            end = Offset(255.dp.toPx(), 75.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )

        drawLine(
            color = Color.White,
            start = Offset(215.dp.toPx(), 35.dp.toPx()),
            end = Offset(255.dp.toPx(), 35.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )
//      Г
        drawLine(
            color = Color.White,
            start = Offset(275.dp.toPx(), 120.dp.toPx()),
            end = Offset(275.dp.toPx(), 35.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )

        drawLine(
            color = Color.White,
            start = Offset(275.dp.toPx(), 35.dp.toPx()),
            end = Offset(315.dp.toPx(), 35.dp.toPx()),
            strokeWidth = 5.dp.toPx()
        )
    }
}

@Preview
@Composable
fun CanvasExample2DarkTheme() {
    ComposeCustomeViewTheme(
        darkTheme = true
    ) {
        CanvasEx2()
    }
}