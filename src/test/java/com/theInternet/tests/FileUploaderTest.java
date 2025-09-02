package com.theInternet.tests;

import com.theInternet.core.TestBase;
import com.theInternet.pages.ContextMenuPage;
import com.theInternet.pages.HomePage;
import com.theInternet.pages.UploadPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FileUploaderTest extends TestBase {

    UploadPage uploadPage;

    @BeforeEach
    public void precondition() {
        uploadPage = new UploadPage(driver);
        new HomePage(driver).goToHomePage()
                .clickOnFileUploadPage();
    }

    @Test
    public void fileIploaderTest() {
        uploadPage.findElement();
        uploadPage.clickOnUploadButton(); // click on Upload button
        uploadPage.verifyResultTest("File Uploaded!");
    }
}
