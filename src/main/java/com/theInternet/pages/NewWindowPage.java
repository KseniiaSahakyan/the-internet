package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWindowPage extends BasePage {

    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement clickHereLink;

    public NewWindowResultPage clickOnClickHereLink() {
        click(clickHereLink);

        // тут нужно переключиться на новое окно
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        return new NewWindowResultPage(driver);
    }
}
