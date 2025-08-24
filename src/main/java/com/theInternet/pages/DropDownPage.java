package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage extends BasePage {

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdownElement;

    public DropDownPage selectDropDown(String optionText) {
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(optionText);
        return this;
    }

    public DropDownPage verifySelectDropDown(String option) {
        String firstSelectedOption = new Select(dropdownElement).getFirstSelectedOption().getText();
        Assertions.assertTrue(shouldHavetext(dropdownElement, firstSelectedOption, 5));
        return this;
    }
}
