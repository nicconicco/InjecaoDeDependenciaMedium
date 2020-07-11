package nicco.com.br.dependencyinjection

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import nicco.com.br.dependencyinjection.dagger_android.DaggerAndroidActivity
import org.junit.Test

class ApplicationTest {

    @Test
    fun runApp() {
        ActivityScenario.launch(DaggerAndroidActivity::class.java)

        Thread.sleep(2000)
        onView(withId(R.id.username)).perform(typeText("username"), closeSoftKeyboard())
        onView(withId(R.id.password)).perform(typeText("password"), closeSoftKeyboard())
        onView(withId(R.id.login)).perform(click())

        onView(ViewMatchers.withText("Fake implements works!")).check(
            ViewAssertions.matches(
                ViewMatchers.isDisplayed()
            )
        )

        Thread.sleep(5000)
    }
}