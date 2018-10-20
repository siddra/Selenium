package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CNN {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://cnn.com");
        String text = driver.findElement(By.id("//*[@id='nav-expanded-menu']/div[7]/a/img")).getText();
        System.out.println(text);
    }
}
