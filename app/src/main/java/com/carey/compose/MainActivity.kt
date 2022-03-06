package com.carey.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.carey.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android", true)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, isShowName: Boolean) {
    val showName = if (isShowName) "显示名字" else "不显示名字"
    Text(text = "Hello $name! $showName")
}

@Preview(showBackground = true, widthDp = 200, heightDp = 150)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting("compose开发者", true)
    }
}