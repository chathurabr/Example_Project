package com.examples.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chathura on 12/30/2016.
 */
public class IEWebDriver {
    WebDriver driver;

    @Test
    public void base () {

        System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\executables\\IEDriverServer.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://opensource.demo.orangehrmlive.com/");
    }
}
