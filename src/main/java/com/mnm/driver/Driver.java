package com.mnm.driver;

import com.mnm.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){

    }
    private static WebDriver driver;


    public static void initDriver(){
        if (Objects.isNull(driver)){
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            driver = new ChromeDriver();
            System.out.println(DriverManager.getDriver());
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get("https://google.com");
        }
    }
    public static void quitDriver(){
        if (Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
