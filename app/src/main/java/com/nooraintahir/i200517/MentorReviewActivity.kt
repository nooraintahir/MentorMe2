package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MentorReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_review)
        val submitbtn = findViewById<Button>(R.id.feedback)
        submitbtn.setOnClickListener {
            val intent = Intent(this, MentorActivity::class.java)
            startActivity(intent)
        }
    }
}