package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AllLinks {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //implicit wait - dynamic wait
        //applicable to all driver.findElement commands
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://cnn.com");
        //all links
        //driver.findElement(By.xpath("//a"))
//        List<WebElement> links = driver.findElement(By.tagName("a"));
//        System.out.println("Total links - " + links.size());
    }
}
