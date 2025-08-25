package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends BasePage {

    @FindBy(css = "input[type='range']")
    private WebElement slider;

    @FindBy(id = "range")
    private WebElement sliderValue;

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    public void moveSliderTo(String value) {
        Actions actions = new Actions(driver);
        actions.click(slider).perform();
    }

    public String getSliderValue() {
        return sliderValue.getText();
    }
}

//
//
//public class SliderPage extends BasePage {
//
//    public SliderPage(WebDriver driver) {
//        super(driver);
//    }
//
//    @FindBy(css = "input[type='range']")
//    WebElement slider;
//
//    public SliderPage moveSliderToHorizontalDirection() {
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(slider, 3, 0).perform();
//        return this;
//    }
//
//    @FindBy(id = "range")
//    WebElement sliderValue;
//
//    public SliderPage verifySliderValue(String number) {
//        Assertions.assertEquals(number, sliderValue.getDomAttribute("value"));
//        return this;
//    }
//}
