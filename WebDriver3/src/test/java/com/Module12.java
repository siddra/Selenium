package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.safari.SafariDriver;

public class Module12 {

    public static void main(String[] args) {
        String browser = "Mozilla";
        WebDriver driver = null;

//All the driver classes will have the same function.
        if(browser.equals("Mozilla")) {
            driver = new FirefoxDriver();

        } else if (browser.equals("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equals("IE")) {
            driver = new InternetExplorerDriver();

        } else  if(browser.equals("Edge")) {
            driver = new EdgeDriver();
        }

        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
/*
//The by class has the mechanism used to locate elements within a document.
        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.name("pass"));
//This will write selenium in the username function
        username.sendKeys("selenium");
        password.sendKeys("selenium");
        WebElement loginbutton = driver.findElement(By.id("u_0_2"));
        loginbutton.click();
        System.out.println(username.getLocation().x);
        System.out.println(username.getLocation().y);
*/
//Another shorter way of running the same code as above.
//        driver.findElement(By.id("email")).sendKeys("selenium");
//        driver.findElement(By.name("pass")).sendKeys("selenium");
//        driver.findElement(By.id("u_0_2")).click();

        //XPath
//        driver.findElement(By.xpath("html/body/div/div[1]/div[1]/a/img")).click();
        //In Selenium the double quotes must be replaced with single quotes.
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");

//How do you identify the objects? Everything starts from the WebDriver interface. In that architecture of Selenium
//there is another interface that is known as WebElement.
//Every element on a web-page will have a tag. (8:26)

//        driver.quit();

//How do I write a separate script that can be applied to every driver? With this method below I have to write a
//separate code for each driver class.
//get function takes you to the url
//        if(browser.equals("Mozilla")) {
//            FirefoxDriver fd = new FirefoxDriver();
//            fd.get("https://www.w3resource.com/java-exercises/basic/index.php#editorr");
//        } else if (browser.equals("Chrome")) {
//            ChromeDriver cd = new ChromeDriver();
//            cd.get("https://www.w3resource.com/java-exercises/basic/index.php#editorr");
//        } else if (browser.equals("IE")) {
//            InternetExplorerDriver ie = new InternetExplorerDriver();
//            ie.get("https://www.w3resource.com/java-exercises/basic/index.php#editorr");
//        } else  if(browser.equals("Edge")) {
//            SafariDriver safari = new SafariDriver();
//            safari.get("https://www.w3resource.com/java-exercises/basic/index.php#editorr");
//        }
    }
}
