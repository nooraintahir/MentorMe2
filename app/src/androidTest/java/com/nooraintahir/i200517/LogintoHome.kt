package com.nooraintahir.i200517

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LogintoHome {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun testLoginButton() {
        // Perform click on the login button
        onView(withId(R.id.login)).perform(click())

        // Check if NavigationActivity is displayed
        onView(withId(R.id.navigation_activity)).check(matches(isDisplayed()))
    }
}
