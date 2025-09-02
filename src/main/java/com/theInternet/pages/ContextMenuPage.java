package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

//    public ContextMenuPage clickArrowDownAndEnter() {
//        actions.sendKeys(Keys.ARROW_DOWN).perform();
//        System.out.println(">>> нажимаем стрелку вниз");
//        actions.sendKeys(Keys.ENTER).perform();
//        System.out.println(">>> нажимаем Enter");
//        return this;
//    }

    public ContextMenuPage goBack() {
        driver.navigate().back();
        System.out.println(">>> возвращаемся на предыдущую страницу");
        return this;
    }

    @FindBy(css = "h1")
    private WebElement confirmTestResult;

    public ContextMenuPage verifyResultTest(String expectedText) {
        // Ждём, пока элемент станет видимым
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(confirmTestResult));

        // Проверяем, что текст совпадает с ожидаемым
        String actualText = confirmTestResult.getText();
        Assertions.assertEquals(expectedText, actualText,
                "Текст заголовка не совпадает с ожидаемым");

        System.out.println(">>> Проверка текста успешна: " + actualText);
        return this;
    }



}
