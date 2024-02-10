package com.nooraintahir.i200517

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    // Splash screen duration in milliseconds
    private val SPLASH_DELAY: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Delayed navigation to HomeActivity
        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, HomeActivity::class.java))
        }, SPLASH_DELAY)
    }
}
