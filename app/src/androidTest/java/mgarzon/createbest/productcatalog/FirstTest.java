package mgarzon.createbest.productcatalog;


import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;


@RunWith(AndroidJUnit4.class)
    @LargeTest
    public class FirstTest {

        private String mStringToBetyped;
        private String mNumberToBetyped;
        @Rule
        public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
                MainActivity.class);

        @Before
        public void initValidString() {
            // Specify a valid string.
            mStringToBetyped = "Espresso";
            mNumberToBetyped = "1234";
        }

        @Test
        public void changeText_sameActivity() {
            // Type text and then press the button.
            onView(withId(R.id.editTextName))
                    .perform(typeText(mStringToBetyped), closeSoftKeyboard());
            onView(withId(R.id.editTextPrice))
                    .perform(typeText(mNumberToBetyped), closeSoftKeyboard());
            onView(withText("Espresso")).check(matches(isDisplayed()));

        }
    }
