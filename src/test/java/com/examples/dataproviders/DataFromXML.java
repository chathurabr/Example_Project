package com.examples.dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/7/2015.
 */
public class DataFromXML {       // run this using TestNG.xml file

    private WebDriver driver;

    private static final String BASE_URL= "http://opensource.demo.orangehrmlive.com/";


    @Test
    @Parameters("browser")
    public void beforeSuite(String browser){


        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(BASE_URL);

        }else if (browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(BASE_URL);
        }
    }


    //Parameters from XML
    @Test
    @Parameters({"username","password"})
    public void testUserLogin(String username, String password){
        System.out.println(" " + username);
        System.out.println(" " + password);
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }



}
