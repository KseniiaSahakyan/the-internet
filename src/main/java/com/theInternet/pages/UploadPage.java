package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileSelector;

    public UploadPage findElement() {
        fileSelector.sendKeys("/Users/kseniiasahakyan/Pictures/1ad04e579c748d32056609c318a5685f.png");
        return this;
    }

    public UploadPage sendKeys(String filePath) {
        sendKeys(filePath);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement uploadButton;

    public UploadPage clickOnUploadButton() {
        click(uploadButton);
        return this;
    }

    @FindBy(css = "h3")
    WebElement confirmUploadResult;

    public UploadPage verifyResultTest(String text) {
        Assertions.assertTrue(containsText(text, confirmUploadResult));
        return this;
    }
}
