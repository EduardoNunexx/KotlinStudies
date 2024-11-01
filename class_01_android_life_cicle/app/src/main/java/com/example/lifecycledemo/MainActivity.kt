package com.example.lifecycledemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lifecycledemo.ui.theme.LifeCycleDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LifeCycleDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        //log message on created
        Log.d("Life Cycle Demo","OnCreated called")
        Toast.makeText(this,"OnCreated called",Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
            //log message on start
            Log.d("LifecycleDemo", "onStart called")
            Toast.makeText(this, "onStart called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"OnPause called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life Cycle Demo", "OnStop called")
        Toast.makeText(this,"OnStop called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life Cycle Demo", "OnDestroy called")
        Toast.makeText(this,"OnDestroy called", Toast.LENGTH_SHORT).show();
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LifeCycleDemoTheme {
        Greeting("Android")
    }
}