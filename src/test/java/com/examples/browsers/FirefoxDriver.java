package com.examples.browsers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chathura on 12/30/2016.
 */
public class FirefoxDriver {
    private WebDriver driver;

    private static final String BASE_URL= "http://opensource.demo.orangehrmlive.com/";

    @Test
    public void Base (){


        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\executables\\geckodriver.exe");
       // System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new org.openqa.selenium.firefox.FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get(BASE_URL);

    }
}
