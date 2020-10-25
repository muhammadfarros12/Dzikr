package com.example.dhikr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler().postDelayed({
            val pindahscreen = Intent(this@SplashScreen,MainActivity::class.java)
            startActivity(pindahscreen)
            finish()
        },2500)
    }
}