package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MentorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor)

        val reviewbtn = findViewById<Button>(R.id.review)
        reviewbtn.setOnClickListener {
            val intent = Intent(this, MentorReviewActivity::class.java)
            startActivity(intent)
        }

        val booksession = findViewById<Button>(R.id.session)
        booksession.setOnClickListener {
            val intent = Intent(this, BookAppointmentActivity::class.java)
            startActivity(intent)
        }
    }
}