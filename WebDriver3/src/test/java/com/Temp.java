package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Temp {

    public static void main(String[] args) {
//WebDriver is the interface and ChromeDriver is the implementing class.
//        WebDriver cd = new ChromeDriver();
//        WebDriver fd = new FirefoxDriver();
//        WebDriver sd = new SafariDriver();

//WebDriver is a reference that is not pointing anywhere when it is set to null.
//But you can set it to other implementing classes
//With this method, all browsers will launch simultaneously
        WebDriver driver = null;
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        driver = new SafariDriver();
        driver.get("https://www.aol.com/");

        driver = new FirefoxDriver();
        driver.get("https://www.yahoo.com/");
    }
}
