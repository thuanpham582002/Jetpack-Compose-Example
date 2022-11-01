package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /** greeting is a composable function
                    that is defined below
                    it takes a string as a parameter
                    and displays it on the screen
                    in a text view
                     */
                    Greeting("Android")
                }
            }
        }
    }
}

// Composable , function name starts with a capital letter
// @Composable annotation is used to mark a function as a composable function
// Composable functions can only be called from other composable functions
// @Composable functions can't return anything
// Surface is a composable function that is used to create a surface
// Surface is a container that can be used to draw a background
@Composable
fun Greeting(name: String) {
    Surface(color = Color.Cyan) {
        Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
    }
}

// Preview annotation is used to show the UI in the preview window
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeExampleTheme {
        Greeting("Android")
    }
}