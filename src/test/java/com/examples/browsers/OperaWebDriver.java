package com.examples.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chathura on 12/30/2016.
 */
public class OperaWebDriver {
    WebDriver driver;

    @Test
    public void base () {
        System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\executables\\operadriver.exe");
      //  System.setProperty("webdriver.opera.driver", "C:\\operadriver.exe");
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://opensource.demo.orangehrmlive.com/");
    }
}
