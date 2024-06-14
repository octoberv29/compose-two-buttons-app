package com.sumup.sampletwobuttonapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sumup.sampletwobuttonapp.ui.theme.SampleTwoButtonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleTwoButtonAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val secondaryDefault = Color(0xFFFFFFFF)
    val onSecondaryDefault = Color(0xFF1A1A1A)
    val borderNormal = Color(0xFFCCCCCC)

    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            modifier = modifier
                .wrapContentSize()
                .padding(8.dp)
                .size(160.dp),
            onClick = {
                Toast.makeText(context, "Button 1", Toast.LENGTH_SHORT).show()
            },
            border = BorderStroke(2.dp, borderNormal),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = secondaryDefault,
                contentColor = onSecondaryDefault,
            ),
            enabled = true,
            content = {
                Text(
                    text = "Button 1",
                    fontWeight = FontWeight.Bold
                )
            }
        )
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            modifier = modifier
                .wrapContentSize()
                .padding(8.dp)
                .size(160.dp),
            onClick = {
                Toast.makeText(context, "Button 2", Toast.LENGTH_SHORT).show()
            },
            border = BorderStroke(2.dp, borderNormal),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = secondaryDefault,
                contentColor = onSecondaryDefault,
            ),
            enabled = true,
            content = {
                Text(
                    text = "Button 2",
                    fontWeight = FontWeight.Bold
                )
            }
        )
    }

}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun GreetingPreview() {
    SampleTwoButtonAppTheme {
        Greeting("Android")
    }
}
