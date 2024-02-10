package com.nooraintahir.i200517

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Get the action bar and hide it
        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.hide()
        }
    }
}