package com.nooraintahir.i200517

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

@Suppress("DEPRECATION")
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        // Set up bottom navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {

                    if (javaClass != HomeActivity::class.java) {
                        // Navigate back to HomeActivity
                        startActivity(Intent(this, HomeActivity::class.java))
                    }
                    true
                }
                R.id.navigation_search -> {
                    startActivity(Intent(this, LoginActivity::class.java))
                    true
                }
                R.id.navigation_chat -> {
                    // Handle chat navigation
                    true
                }
                R.id.navigation_profile -> {
                    // Handle profile navigation
                    true
                }
                else -> false
            }
        }

        // Set up action button click listener
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            // Handle action button click
        }
    }
}
