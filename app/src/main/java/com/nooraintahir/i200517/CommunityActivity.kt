package com.nooraintahir.i200517

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class CommunityActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.activity_community, container, false)

        val call = view.findViewById<Button>(R.id.callicon)
        call.setOnClickListener {
            val intent = Intent(requireContext(), CallActivity::class.java)
            startActivity(intent)
        }

        val vidcall = view.findViewById<Button>(R.id.videoicon)
        vidcall.setOnClickListener {
            val intent = Intent(requireContext(), CallActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}