package com.agivision.alltest;

import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.hasFocus;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Administrator on 2017/3/6 0006.
 *
 */
@RunWith(AndroidJUnit4.class)
public class MainUIActivityTest {

    @Rule
    public ActivityTestRule mainUIRule = new ActivityTestRule(MainUI.class);

    @Test
    public void testViewDisplay() {
        onView(withText("悬浮窗test")).check(ViewAssertions.matches(isDisplayed()));
        ViewInteraction et_testzz =  onView(withId(R.id.et_testzz));
        et_testzz.perform(replaceText("18894001263"), closeSoftKeyboard());
        et_testzz.perform(clearText());
        int i = 0;
        while (i<100) {
            et_testzz.perform(replaceText("12568974525"), closeSoftKeyboard());
            et_testzz.perform(clearText());
            if (i == 50) {
                onView(withText("悬浮窗test")).perform(click());
            }
            i++;
        }
    }
}
