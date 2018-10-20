package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Module13 {
    public static void main(String[] args) throws InterruptedException {
        //As soon as the browser launches, we should give the explicit wait, just like the example below
        WebDriver driver = new FirefoxDriver();
        //implicit wait - dynamic wait
        //This is applicable to all driver.findElement commands
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //It will wait dynamically wait for 20 seconds, but if the element is found in less time, it will use it and
        //move forward.
        driver.get("http://cnn.com");

        //This means, wait for 10 seconds even if the element is found.
//        Thread.sleep(10000);

        String text = driver.findElement(By.xpath("//*[@id='homepage1-zone-1']")).getText();
        System.out.println(text);

    }
}
