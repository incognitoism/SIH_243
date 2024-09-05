package com.example.krypton

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.krypton.ui.theme.KRYPTONTheme

class MainPage : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage) // Replace with your XML file name

        val buttonOpenCamera: Button = findViewById(R.id.button1)
        val buttonSecondAction: Button = findViewById(R.id.button2)
        val buttonThirdAction: Button = findViewById(R.id.button3)

        buttonOpenCamera.setOnClickListener {
            // Start SecondActivity
            val intent = Intent(this, konfig::class.java)
            startActivity(intent)
        }

        buttonSecondAction.setOnClickListener {
            finish()
        }

        buttonThirdAction.setOnClickListener {
            // Handle third action here
        }
    }
}
