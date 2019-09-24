package mobi.quadram.qsamples

import android.widget.TextView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import mobi.quadram.qsamples.ui.main.MainActivity
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.MockitoAnnotations

class PresenterTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun checkSecondTextAfterClick() {
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click())

        Espresso.onView(ViewMatchers.withId(R.id.text)).check { view, noViewFoundException ->
            Assert.assertTrue(hasText(view as TextView, "FAKE"))
        }

    }

    private fun hasText(it: TextView, str: String) = it.text?.toString()?.equals(str) ?: false
}