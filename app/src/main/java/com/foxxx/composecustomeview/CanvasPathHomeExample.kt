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
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.foxxx.composecustomeview.ui.theme.ComposeCustomeViewTheme

@Composable
fun CanvasPathHomeEx() {
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
                moveTo(center.x, 200.dp.toPx())

                lineTo(center.x + 400, 270.dp.toPx())
                lineTo(center.x - 400, 270.dp.toPx())
                lineTo(center.x, 200.dp.toPx())

                drawCircle(
                    style = Stroke(
                        width = 4.dp.toPx()
                    ),
                    color = Color.White,
                    radius = 20.dp.toPx(),
                    center = Offset(
                        center.x, 235.dp.toPx(),
                    )
                )

                drawCircle(
                    color = Color.Black,
                    radius = 20.dp.toPx(),
                    center = Offset(
                        center.x, 235.dp.toPx(),
                    )
                )

                moveTo(center.x - 350, 270.dp.toPx())
                lineTo(center.x - 350, 470.dp.toPx())
                lineTo(center.x + 350, 470.dp.toPx())
                lineTo(center.x + 350, 270.dp.toPx())

                moveTo(center.x - 250, 320.dp.toPx())
                lineTo(center.x - 250, 420.dp.toPx())
                lineTo(center.x + 250, 420.dp.toPx())
                lineTo(center.x + 250, 320.dp.toPx())
                lineTo(center.x - 250, 320.dp.toPx())

                moveTo(center.x, 320.dp.toPx())
                lineTo(center.x, 420.dp.toPx())

                moveTo(center.x - 250, 370.dp.toPx())
                lineTo(center.x + 250, 370.dp.toPx())
            },
            color = Color.White,
            style = Stroke(
                width = 4.dp.toPx()
            )

        )

        drawPath(
            path = Path().apply {
                moveTo(center.x - 250, 320.dp.toPx())
                lineTo(center.x - 250, 420.dp.toPx())
                lineTo(center.x + 250, 420.dp.toPx())
                lineTo(center.x + 250, 320.dp.toPx())
                lineTo(center.x - 250, 320.dp.toPx())


            },
            color = Color.Black,
            style = Fill
        )

        drawPath(
            path = Path().apply {
                moveTo(center.x, 320.dp.toPx())
                lineTo(center.x, 420.dp.toPx())

                moveTo(center.x - 250, 370.dp.toPx())
                lineTo(center.x + 250, 370.dp.toPx())
            },
            color = Color.White,
            style = Stroke(
                width = 4.dp.toPx()
            )
        )
    }
}

@Preview
@Composable
fun CanvasPathHomeExampleDarkTheme() {
    ComposeCustomeViewTheme(
        darkTheme = true
    ) {
        CanvasPathHomeEx()
    }
}