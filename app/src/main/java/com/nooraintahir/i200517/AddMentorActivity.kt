package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class AddMentorActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_add_mentor, container, false)

        val uploadButton = view.findViewById<Button>(R.id.uploadmentor)
        uploadButton.setOnClickListener {
            val results = requireActivity() as? NavigationActivity
            results?.switchHome()
        }

        return view
    }
}