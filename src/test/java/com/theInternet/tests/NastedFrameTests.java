package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.HomePage;
import com.theInternet.pages.JavaScriptAlertsPage;
import com.theInternet.pages.NestedFramePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NastedFrameTests extends TestBase {

    NestedFramePage nestedFramePage;;

    @BeforeEach
    public void Precondition() {
        nestedFramePage = new NestedFramePage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnNestedFramesPage();
    }

    @Test
    public void findNestedFramesTest() {
        nestedFramePage.verifyNestedframes();
    }
}
