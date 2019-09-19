package mobi.quadram.qsamples

import android.app.Application
import android.widget.TextView
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import mobi.quadram.qsamples.dii.DaggerExampleComponent
import mobi.quadram.qsamples.dii.Info
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkTextOfView() {
        activityScenarioRule.scenario.onActivity {
            onView(withId(R.id.text)).check { view, noViewFoundException ->
                assertTrue(hasText(view as TextView, "Hi"))
            }
        }

    }

    @Test
    fun checkSecondTextAfterClick() {
        activityScenarioRule.scenario.onActivity {
            onView(withId(R.id.button)).perform(click())

            onView(withId(R.id.text)).check { view, noViewFoundException ->
                assertTrue(hasText(view as TextView, "Hi 2"))
            }
        }

    }

    private fun hasText(it: TextView, str: String) = it.text?.toString()?.equals(str) ?: false

}




