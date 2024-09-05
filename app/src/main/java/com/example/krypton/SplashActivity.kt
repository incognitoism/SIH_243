package com.example.krypton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.Toast




class SplashActivity : AppCompatActivity() {

    private val correctEmail = "bias"
    private val correctPassword = "bias"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val emailEditText = findViewById<EditText>(R.id.email_splash)
        val passwordEditText = findViewById<EditText>(R.id.password_splash)
        val signInButton = findViewById<Button>(R.id.password_button)

        signInButton.setOnClickListener {
            val enteredEmail = emailEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()

            if (enteredEmail == correctEmail && enteredPassword == correctPassword) {
                // Redirect to the next page
                val intent = Intent(this, MainPage::class.java)
                startActivity(intent)
                finish() // Optional: Close this activity
            } else {
                // Show an error message
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}