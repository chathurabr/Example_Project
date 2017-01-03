package com.examples.datepikker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Chathura on 1/3/2017.
 */
public class DatePikker {
    WebDriver driver;


    @BeforeTest
    public void main(){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://enterprise-demo.orangehrmlive.com/auth/login");
    }


    @Test
    public void datepikker(){
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("linda.anderson");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("linda.anderson");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Leave")));

        driver.findElement(By.linkText("My Leave")).click();


        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("28")).click();


    }
}
