package com.nooraintahir.i200517

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.Fragment

class AddMentorActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_add_mentor, container, false)

        var status = arrayOf("Available","Not Available")
        val statusAdapter = ArrayAdapter(requireContext(), R.layout.spinner_design, status)
        statusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val statusSpinner = view.findViewById<Spinner>(R.id.status)
        statusSpinner.adapter = statusAdapter

        val uploadButton = view.findViewById<Button>(R.id.uploadmentor)
        uploadButton.setOnClickListener {
            val results = requireActivity() as? NavigationActivity
            results?.switchHome()
        }

        return view
    }
}
