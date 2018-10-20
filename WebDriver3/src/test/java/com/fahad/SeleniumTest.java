package com.fahad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void launchSite() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }
}
