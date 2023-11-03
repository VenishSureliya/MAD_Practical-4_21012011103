package com.rono.mad_practical_4_21012011103

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login: Button = findViewById<Button>(R.id.login)
        val signup: Button = findViewById<Button>(R.id.signup)

        login.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java).also { startActivity(it) }
        }
        signup.setOnClickListener {
            Intent(this@MainActivity, SignupActivity::class.java).also { startActivity(it) }
        }
    }
}

