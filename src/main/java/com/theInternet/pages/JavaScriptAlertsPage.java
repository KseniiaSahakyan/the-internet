package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlertButton;

    public JavaScriptAlertsPage clickOnJSAlertButton() {
        jsAlertButton.click();
        return new JavaScriptAlertsPage(driver);
    }

    public JavaScriptAlertsPage selectResult(String result) {

        if (result != null && result.equals("Ok")) {
            driver.switchTo().alert().accept();
        } else if (result != null && result.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;

    public JavaScriptAlertsPage verifyResult(String text) {
        Assertions.assertTrue(containsText(text, confirmResult));
        return this;
    }

    //    public JavaScriptAlertPage verifyResult(String expectedText) {
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.textToBePresentInElement(resultMessage, expectedText));
//        Assert.assertEquals(resultMessage.getText(), expectedText);
//        return this;
//
    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement jsConfirmButton;

    public JavaScriptAlertsPage clickOnJSconfirmButton() {
        jsConfirmButton.click();
        return this;
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement jsPromtButton;

    public JavaScriptAlertsPage clickOnJSPromtButton() {
        click(jsPromtButton);
        return this;
    }

    public JavaScriptAlertsPage sendMessageToAlert(String message) {
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//p[@id='result' and text()='You clicked: Cancel']")
    WebElement cancelMessage;


}