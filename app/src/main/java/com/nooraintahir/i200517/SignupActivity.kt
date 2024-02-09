package com.nooraintahir.i200517

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    private val countries = arrayOf("Select Country", "USA", "Canada", "UK", "Australia")
    private val cities = arrayOf("", "New York", "Los Angeles", "Chicago", "Houston")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val countryAdapter = ArrayAdapter(this, R.layout.spinner_design, countries)
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val countrySpinner = findViewById<Spinner>(R.id.country)
        countrySpinner.adapter = countryAdapter

        val cityAdapter = ArrayAdapter(this, R.layout.spinner_design, cities)
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val citySpinner = findViewById<Spinner>(R.id.city)
        citySpinner.adapter = cityAdapter

        countrySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val value = parent!!.getItemAtPosition(position).toString()
                if(value == countries[0]){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do something
            }
        }

    }
}
