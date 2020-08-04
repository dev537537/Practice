package com.example.liraxupdate.Activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.liraxupdate.R
@Suppress("DEPRECATION")
class Splash_Screen : AppCompatActivity() {
    lateinit var splashimageview : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val animation: Animation = AlphaAnimation(0.0f,1.0f);
        splashimageview = findViewById(R.id.login_logo)
        animation.interpolator = LinearInterpolator()
        animation.repeatCount = Animation.INFINITE
        animation.duration = 2000
        splashimageview.startAnimation(animation)

        val handler = Handler()

        handler.postDelayed(
            {
                val intnet = Intent(applicationContext,LogInActivity::class.java)
                startActivity(intnet)
                finish()
            },5000
        )
    }
}