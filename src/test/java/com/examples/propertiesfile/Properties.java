package com.examples.propertiesfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Chathura on 1/3/2017.
 */
public class Properties {
    WebDriver driver;

        @Test                        // Give Password to login
        public void loginTest() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("http://opensource.demo.orangehrmlive.com/");


            java.util.Properties properties =new java.util.Properties();
            try {
                properties.load(new FileInputStream("C:\\Users\\Chathura\\IdeaProjects\\Selenium_Example_Full_Project\\Example_Project\\project.properties"));

                driver.findElement(By.id("txtUsername")).sendKeys(properties.getProperty("USERNAME"));
                driver.findElement(By.id("txtPassword")).sendKeys(properties.getProperty("PASSWORD"));


            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
