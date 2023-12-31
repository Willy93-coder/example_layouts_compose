package com.example.layoutscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutscompose.ui.theme.LayoutsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    FirstExercise()
                }
            }
        }
    }
}

@Composable
fun FirstExercise() {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        // Spacer(modifier = Modifier.height(50.dp))
        MySpacer(size = 30)
        Row(
            modifier = Modifier
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .weight(1f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Ejemplo 2")
            }
            Box(
                modifier = Modifier
                    .background(Color.Green)
                    .weight(1f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Ejemplo 3")
            }
        }
        MySpacer(size = 30)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}

@Composable
fun MySpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun MyRow() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .width(100.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .width(100.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .width(100.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .width(100.dp)
        )
        Text(
            text = "Text 5",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .width(100.dp)
        )
        Text(
            text = "Text 6",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .width(100.dp)
        )
    }
}

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Text 1",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Text 2",
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Text 3",
            modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Text 4",
            modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}

@Composable
fun MyBox() {
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .background(Color.Cyan)
                    .border(1.dp, Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Hello world")
            }
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(Color.Red)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutsComposeTheme {
        FirstExercise()
    }
}