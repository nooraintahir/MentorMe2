package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val verifybtn = findViewById<Button>(R.id.verifyphone)
        verifybtn.setOnClickListener {
            val intent = Intent(this, NewPassActivity::class.java)
            startActivity(intent)
        }
    }
}