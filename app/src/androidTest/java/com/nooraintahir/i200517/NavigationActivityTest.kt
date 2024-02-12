package com.nooraintahir.i200517

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.isSelected
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationActivityTest {

    @Rule
    @JvmField
    val activityScenarioRule = ActivityScenarioRule(NavigationActivity::class.java)

    @Test
    fun testSwitchToSearch() {
        // Click on the search item in the bottom navigation view
        onView(withId(R.id.navigation_search)).perform(click())

        // Check if the search fragment is displayed
        onView(withId(R.id.search_fragment)).check(matches(isDisplayed()))
    }
}
