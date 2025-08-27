package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class ContextMenuPage extends BasePage {


    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    @FindBy(id = "hot-spot")
    WebElement borderedElement;

    public ContextMenuPage clickOnElement() {
//        click(borderedElement);
        actions.contextClick(borderedElement).perform();
        return this;
    }

    public ContextMenuPage confirmResult(String ok) {
        driver.switchTo().alert().accept();
        return this;
    }

    public ContextMenuPage clickArrowDownAndEnter() {
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        System.out.println(">>> нажимаем стрелку вниз");
        actions.sendKeys(Keys.ENTER).perform();
        System.out.println(">>> нажимаем Enter");
        return this;
    }

    @FindBy(css = "h3")
    WebElement confirmTestResult;

    public ContextMenuPage verifyResultTest(String text) {
        Assertions.assertTrue(containsText(text, confirmTestResult));
        return this;
    }



}
