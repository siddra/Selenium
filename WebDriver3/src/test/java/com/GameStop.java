package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GameStop {
    public static void main(String[] args)  {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("selenium");

        String text = driver.findElement(By.id("login1")).getText();
        System.out.println(text);

        text = driver.findElement(By.xpath("//div[@class='login-form']/div[3]/div")).getText();
        System.out.println(text);

        text = driver.findElement(By.id("login1")).getAttribute("maxlength");
        System.out.println(text);

        text = driver.findElement(By.id("login1")).getAttribute("value");
        System.out.println(text);

        text = driver.findElement(By.name("proceed")).getAttribute("value");
        System.out.println(text);

        driver.quit();
    }
}
