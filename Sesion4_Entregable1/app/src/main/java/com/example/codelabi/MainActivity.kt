package com.example.codelabi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelabi.ui.theme.CodeLabITheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeLabITheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    EJ3(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun EJ1(modifier: Modifier) {
    Column(modifier) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null
        )
        TextContent(
            modifier = modifier
        )
    }
}

@Composable
fun TextContent(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.title),
        modifier = modifier
            .padding(16.dp),
        fontSize = 24.sp
    )
    Text(
        text = stringResource(R.string.Subtitle),
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(16.dp)
    )
    Text(
        text = stringResource(R.string.body),
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(16.dp)
    )
}

@Composable
fun EJ2(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.task_completed),
            contentDescription = null
        )
        Text (
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = modifier.padding(
                top = 24.dp,
                bottom = 8.dp
            )

        )
        Text (
            text = "Nice work!"
        )
    }
}

@Composable
fun TextSquare(
    title: String,
    message: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    // un comentario
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(backgroundColor)
            .padding(8.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = message,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun EJ3(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
    ) {
        Column (
            modifier = Modifier
                .weight(1f)
        ) {
            TextSquare(
                title = "Text composable",
                message = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            TextSquare(
                title = "Row composable",
                message = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            TextSquare(
                title = "Image composable",
                message = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
            TextSquare(
                title = "Column composable",
                message = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun PreviewEj1() {
    CodeLabITheme {
        Surface (modifier = Modifier.fillMaxSize()) {
            EJ1(
                modifier = Modifier
            )
        }
    }
}

@Composable
@Preview
fun PreviewEj2() {
    CodeLabITheme {
        Surface (modifier = Modifier.fillMaxSize()) {
            EJ2(
                modifier = Modifier
            )
        }
    }
}

@Composable
@Preview
fun TextSquarePreview() {
    CodeLabITheme {
        TextSquare(
            title = "Un título",
            message = "Un mensaje",
            backgroundColor = Color(0xFFF7B2EF)
        )
    }
}

@Composable
@Preview
fun PreviewEJ3() {
    CodeLabITheme {
        EJ3()
    }
}