package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.ContextMenuPage;
import com.theInternet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends TestBase {

    ContextMenuPage contextMenu;

    @BeforeEach
    public void precondition() {
        contextMenu = new ContextMenuPage(driver);
        new HomePage(driver).goToHomePage()
                .clickOnContextMenu();
    }

    @Test
    @Tag("demo")
    public void contextMenuTest() {
        contextMenu.clickOnElement();
        contextMenu.confirmResult("Ok");
        contextMenu.goBack();
        contextMenu.verifyResultTest("Welcome to the-internet");
    }

}