package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.HomePage;
import com.theInternet.pages.JavaScriptAlertsPage;
import com.theInternet.pages.NewWindowPage;
import com.theInternet.pages.NewWindowResultPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewWindowTest extends TestBase {

    NewWindowPage newWindow = new NewWindowPage(driver);

    @BeforeEach
    public void precondition() {
        newWindow = new NewWindowPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnMultipleWindowPage();
    }

    @Test
    public void newWindowTest() {
        NewWindowResultPage newWindowResult =
                newWindow.clickOnClickHereLink(); // возвращает новую страницу

        newWindowResult.verifyResultOnNewWindow("New Window");
    }
}
