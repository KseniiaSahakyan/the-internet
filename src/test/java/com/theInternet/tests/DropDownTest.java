package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.DropDownPage;
import com.theInternet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DropDownTest extends TestBase {

    DropDownPage dropDownPage;

    @BeforeEach
    public void precondition() {
        dropDownPage = new DropDownPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnDropDownPage();
    }

    @Test
    public void DropDownTest() {
        dropDownPage.selectDropDown("Option 1")
                .verifySelectDropDown("Option 1");
    }


}
