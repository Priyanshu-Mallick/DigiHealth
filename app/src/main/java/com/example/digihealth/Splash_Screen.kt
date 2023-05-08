package com.example.digihealth

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val applogo: ImageView = findViewById(R.id.logo)

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            applogo.animate().translationZ(-700F).setDuration(2700).setStartDelay(0)
        } else {
            applogo.animate().translationY(-700F).setDuration(2700).setStartDelay(0)
        }

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}