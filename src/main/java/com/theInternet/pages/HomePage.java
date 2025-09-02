package com.theInternet.pages;

import com.theInternet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(css = "button[onclick='jsAlert()']")
//    private WebElement jsAlertButton;

    public HomePage goToHomePage() {
        driver.get("https://the-internet.herokuapp.com");
        return this;
    }

//    public JavaScriptAlertsPage getJavaScriptAlertsWindows() {
//        clickWithJS(jsAlertButton, 0, 300);
//        return new JavaScriptAlertsPage(driver);
//    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement javaScriptLink;

    public JavaScriptAlertsPage clickOnAlertsPage() {
        clickWithJS(javaScriptLink, 0, 900);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(linkText = "Multiple Windows")
    WebElement newWindow;

    public NewWindowPage clickOnMultipleWindowPage() {
        clickWithJS(newWindow, 0, 900);
        return new NewWindowPage(driver);
    }

    @FindBy(css = "a[href='/nested_frames']")
    WebElement nestedFramesLink;

    public NestedFramePage clickOnNestedFramesPage() {
        clickWithJS(nestedFramesLink, 0, 900);
        return new NestedFramePage(driver);
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropDownLink;

    public DropDownPage clickOnDropDownPage() {
        clickWithJS(dropDownLink, 0, 200);
        return new DropDownPage(driver);
    }

    @FindBy(css = "a[href='/horizontal_slider']")
    WebElement sliderPageLink;

    public SliderPage clickOnSliderPage() {
        clickWithJS(sliderPageLink, 0, 300);
        return new SliderPage(driver);
    }

    @FindBy(css = "a[href='/context_menu']")
    WebElement contextMenu;

    public ContextMenuPage clickOnContextMenu() {
        click(contextMenu);
        return new ContextMenuPage(driver);
    }

    @FindBy(css = "a[href='/upload']")
    WebElement fileUploadLink;

        public UploadPage clickOnFileUploadPage() {
        click(fileUploadLink);
        return new UploadPage(driver);
    }
}
