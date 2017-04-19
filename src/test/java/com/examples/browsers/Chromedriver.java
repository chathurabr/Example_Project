package com.examples.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chathura on 12/30/2016.
 */
public class Chromedriver {
    WebDriver driver;

    @Test
    public void base() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\executables\\chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://opensource.demo.orangehrmlive.com/");
    }
}
