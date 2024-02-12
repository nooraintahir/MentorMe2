package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookAppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_appointment)

        val book = findViewById<Button>(R.id.bookappoint)
        book.setOnClickListener {
            val intent = Intent(this, MentorActivity::class.java)
            startActivity(intent)
        }
    }
}