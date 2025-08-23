package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowResultPage extends BasePage {

    public NewWindowResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h3")
    WebElement newWindowHeader;

    public NewWindowResultPage verifyResultOnNewWindow(String expectedText) {
        Assertions.assertTrue(containsText(expectedText, newWindowHeader));
        return this;
    }
}
