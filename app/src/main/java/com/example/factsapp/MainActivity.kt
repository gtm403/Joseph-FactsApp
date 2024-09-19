package com.example.factsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.factsapp.ui.theme.FactsAppTheme
import androidx.compose.runtime.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FactsAppTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = androidx.compose.ui.graphics.Color.Cyan
                ){
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment  = Alignment.CenterHorizontally
                    ){
                        Facts()
                    }
                }
                }
            }
        }
    }


@Composable
fun Facts() {
    val facts = listOf(
        "The sheep was the first to be cloned.",
        "Giraffe tongues can be 20 inches long.",
        "Scotland chose the unicorn as its national animal.",
        "Fish can cough.",
        "You can see 4 states from Chicago's Willis Tower.",
        "Australia is wider than the moon.",
        "Play-Doh was originally sold and used as wallpaper cleaner.",
        "A snowflake can take up to 2 hours to fall from a cloud to the ground.",
        "A person will die from a lack of sleep sooner than they will from starvation."
    )

    var curr by remember { mutableStateOf(facts.random()) }
    Text(
        text = curr,
        style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold, color = androidx.compose.ui.graphics.Color.Magenta),
        modifier = Modifier.padding(20.dp)
    )
    Button(
        onClick = {curr = facts.random()}
    ) {
        Text(text = "Tap for FACTS!")
    }
}