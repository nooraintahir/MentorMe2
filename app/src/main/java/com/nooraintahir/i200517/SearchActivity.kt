package com.nooraintahir.i200517

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SearchActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_search, container, false)

        // Find the button inside the fragment's layout
        val searchButton = view.findViewById<Button>(R.id.searchbutton)

        // Set click listener for the button
        searchButton.setOnClickListener {
            // start SearchResultsActivity with nav bar
            val results = requireActivity() as? NavigationActivity
            results?.showSearchResults()
        }

        return view
    }

}
