package com.foxxx.composecustomeview

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.foxxx.composecustomeview.ui.theme.ComposeCustomeViewTheme

@Composable
fun CanvasPathEx() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color.Cyan, Color.Magenta),
                    start = Offset(0.dp.toPx(), 100.dp.toPx()),
                    end = Offset(200.dp.toPx(), 200.dp.toPx()),
                    tileMode = TileMode.Mirror
                )
            )
    ) {
        drawPath(
            path = Path().apply {
                moveTo(center.x, 100.dp.toPx())

                lineTo(center.x + 155, 170.dp.toPx())
                lineTo(center.x, 240.dp.toPx())
                lineTo(center.x - 155, 170.dp.toPx())
                lineTo(center.x, 100.dp.toPx())

                moveTo(center.x, 240.dp.toPx())

                lineTo(center.x + 155, 310.dp.toPx())
                lineTo(center.x, 380.dp.toPx())
                lineTo(center.x - 155, 310.dp.toPx())
                lineTo(center.x, 240.dp.toPx())

                moveTo(center.x, 380.dp.toPx())

                lineTo(center.x + 155, 450.dp.toPx())
                lineTo(center.x, 520.dp.toPx())
                lineTo(center.x - 155, 450.dp.toPx())
                lineTo(center.x, 380.dp.toPx())

                moveTo(center.x, 520.dp.toPx())

                lineTo(center.x + 255, 590.dp.toPx())
                lineTo(center.x - 255, 590.dp.toPx())
                lineTo(center.x, 520.dp.toPx())


            },
            color = Color.White,
            style = Fill

        )
    }
}

@Composable
fun Dp.toPx() = with(LocalDensity.current) {
    this@toPx.toPx()
}

@Preview
@Composable
fun CanvasPathExampleDarkTheme() {
    ComposeCustomeViewTheme(
        darkTheme = true
    ) {
        CanvasPathEx()
    }
}