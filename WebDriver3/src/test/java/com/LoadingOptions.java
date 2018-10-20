package com;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class LoadingOptions {

    @Test
    public void executeTest() {
        String browser = "Chrome";
        WebDriver driver = null;

        if (browser.equals("Mozilla")) {
            driver = new FirefoxDriver(loadFirefoxOptions());
        } else if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("IE")) {
            driver = new InternetExplorerDriver();
        } else if (browser.equals("Edge")) {
            driver = new SafariDriver();
        }
    }

    public FirefoxOptions loadFirefoxOptions() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
        //binary
        FirefoxOptions options = new FirefoxOptions();
        //options.setBinary("PATH TO EXE")
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        //Profiling--firefox.exe -p profilemanager
        //tell selenium to launch mod -11
        ProfilesIni allProf = new ProfilesIni();
        FirefoxProfile prof = allProf.getProfile("Mod11");
        //notifications
        prof.setPreference("dom.webnotifications.enabled", false); //turn off
        //certificate
        prof.setAcceptUntrustedCertificates(true);
        prof.setAssumeUntrustedCertificateIssuer(false);

        //proxy servers
        /*
        prof.setPreference("network.proxy.type", 1);
        prof.setPreference("network.proxy.socks", "83.209.94.87");
        prof.setPreference("network.proxy.socks_port", 35923);
         */

        options.setProfile(prof);
        return options;
    }
}