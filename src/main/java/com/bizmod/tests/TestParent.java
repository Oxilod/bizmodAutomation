package com.bizmod.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;

public class TestParent {

    public static WebDriver driver = null;

    @BeforeSuite
    @Parameters({"url", "browser", "driverLocation"})
    public void setup(@Optional("https://bizmod.app") String url,
                      @Optional("Chrome") String browser,
                      @Optional("C:/webdrivers/chromedriver.exe") String driverLocation) {

        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverLocation);
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", driverLocation);
                driver = new FirefoxDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", driverLocation);
                driver = new InternetExplorerDriver();
                break;
        }

        if (null != driver) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(url);
        } else {
            throw new MissingResourceException("Driver not initialized", "Webdriver", "");
        }
    }

    @AfterSuite
    public void teardown() {
        driver.quit();
    }
}
