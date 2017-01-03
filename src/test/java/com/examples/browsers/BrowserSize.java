package com.examples.browsers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Chathura on 1/3/2017.
 */
public class BrowserSize {
    WebDriver driver;

    @Test
    public void base() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("http://opensource.demo.orangehrmlive.com/");


        //full screen size

        //   driver.manage().window().maximize();



        // Given size

      //  Dimension dimension = new Dimension(300, 400);
    //    driver.manage().window().setSize(dimension);


        // half size of the page

        int newHeight = driver.manage().window().getSize().getHeight()/2;
        int newWidth = driver.manage().window().getSize().getWidth()/2;
        driver.manage().window().setSize(new Dimension(newHeight, newWidth));



    }

}
