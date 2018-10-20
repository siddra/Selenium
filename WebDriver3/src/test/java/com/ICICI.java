package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ICICI {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://loan.icicibank.com/asset-portal/auto-loan/" +
                "check-eligibility?WT.mc_id=Desk_NLI_AL_Emical_EliCalIndex-CalEli");


    }
}
