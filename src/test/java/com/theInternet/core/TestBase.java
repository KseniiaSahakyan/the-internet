package com.theInternet.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    protected WebDriver driver;
    public static Logger logger = LoggerFactory.getLogger(TestBase.class);

    protected final ApplicationManager app = new ApplicationManager(System.getProperty("browser","chrome"));


    @BeforeEach
    public void init() {
        driver = app.getDriver();
        app.startTest();
    }

    @AfterEach
    public void tearDown() {
        app.stopTest();
    }

}
