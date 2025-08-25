package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.HomePage;
import com.theInternet.pages.SliderPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SliderTest extends TestBase {

    SliderPage sliderPage;

    @BeforeEach
    public void setUpTest() {
        sliderPage = new SliderPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnSliderPage();
    }

    @Test
    public void moveSliderToTwoPointFive() {
        sliderPage.moveSliderTo("2.5");
        Assertions.assertEquals("2.5", sliderPage.getSliderValue());
    }
}

//   public class SliderTest extends TestBase {
//
//    SliderPage sliderPage;
//
//    @BeforeEach
//    public void precondition() {
//        sliderPage = new SliderPage(driver);
//        HomePage homePage = new HomePage(driver);
//        homePage.goToHomePage();
//        homePage.clickOnSliderPage();
//    }
//
//    @Test
//    public void sliderTest() {
//        sliderPage.moveSliderToHorizontalDirection()
//                .verifySliderValue("50");
//    }
//
//
//}

