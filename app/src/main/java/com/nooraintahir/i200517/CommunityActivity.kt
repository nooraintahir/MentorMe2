package com.nooraintahir.i200517

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

        //val chat = view.findViewById<Button>(R.id.johnchat)
        //chat.setOnClickListener {

        //}

        return view
    }

}