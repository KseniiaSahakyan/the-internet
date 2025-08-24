package com.theInternet.pages;

import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.theInternet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramePage extends BasePage {

    public NestedFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "frame-top")
    WebElement frameTop;

    @FindBy(name = "frame-left")
    WebElement frameLeft;

    @FindBy(name = "frame-middle")
    WebElement frameMiddle;

    @FindBy(name = "frame-right")
    WebElement frameRight;

    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramePage verifyNestedframes() {
        // Левая рамка
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameLeft);
        softly.assertThat(containsText("LEFT", body));
        driver.switchTo().defaultContent(); // возвращаемся к основной странице

        // Средняя рамка
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameMiddle);
        softly.assertThat(containsText("MIDDLE", body));
        driver.switchTo().defaultContent();

        // Правая рамкаSDFGJK`
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameRight);
        softly.assertThat(containsText("RIGHT", body));
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        softly.assertThat(containsText("BOTTOM", body));
        driver.switchTo().defaultContent();

        softly.assertAll();
        return this;
    }
}
