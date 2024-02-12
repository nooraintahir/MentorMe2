package com.nooraintahir.i200517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.nooraintahir.i200517.databinding.ActivityNavigationBinding

class NavigationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            replaceFragment(AddMentorActivity())
        }

        binding.bottomnavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> replaceFragment(HomeActivity())
                R.id.navigation_search -> replaceFragment(SearchActivity())
                R.id.navigation_chat -> replaceFragment(ChatActivity())
                //R.id.navigation_profile -> replaceFragment(ProfileFragment())
            }
            true
        }

        // Set the default fragment
        if (savedInstanceState == null) {
            replaceFragment(HomeActivity())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .commit()
    }

    fun switchHome() {
        replaceFragment(HomeActivity())
        binding.bottomnavigation.selectedItemId = R.id.navigation_home
    }

    fun showSearchResults() {
        replaceFragment(SearchResultsActivity())
    }

}
