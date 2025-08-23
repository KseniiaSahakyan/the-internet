package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.HomePage;
import com.theInternet.pages.JavaScriptAlertsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaScriptAlertsTests extends TestBase {

    JavaScriptAlertsPage javaScriptAlert;

    @BeforeEach
    public void precondition() {
        javaScriptAlert = new JavaScriptAlertsPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.clickOnAlertsPage();
    }

    @Test
    public void JSAlertTest() {
        javaScriptAlert.clickOnJSAlertButton();
        javaScriptAlert.selectResult("Ok")
               .verifyResult("You successfully clicked an alert");
    }

    @Test
    public void JSConfirmTest() {
        javaScriptAlert.clickOnJSconfirmButton();
        javaScriptAlert.selectResult("Отмена")
//                .getWait(1000)
                .verifyResult("You clicked: Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        javaScriptAlert.clickOnJSPromtButton();
        javaScriptAlert.sendMessageToAlert("Hello world!!!")
                .verifyResult("Hello world!!!");
    }
}

