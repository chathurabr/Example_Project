package com.examples.frame;

import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by Chathura on 1/3/2017.
 */
public class TestData {
    WebDriver driver;
    Workbook wb;
    Sheet sh1;
    int numrow;
    String username;
    String password;

    @BeforeTest
    public void Setup()

    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://opensource.demo.orangehrmlive.com/");
    }

    @Test(dataProvider="testdata")
    public void TestFireFox(String uname,String password1)

    {

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(uname);
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password1);
    }

    @DataProvider(name="testdata")
    public Object[][] TestDataFeed(){

        try {

// load workbook
            wb=Workbook.getWorkbook(new File("C:\\Users\\Chathura\\IdeaProjects\\Selenium_Example_Full_Project\\Example_Project\\excel.xls"));

// load sheet in my case I am referring to first sheet only
            sh1= wb.getSheet(0);

// get number of rows so that we can run loop based on this
            numrow=  sh1.getRows();
        }
        catch (Exception e)

        {
            e.printStackTrace();
        }

// Create 2 D array and pass row and columns
        Object [][] facebookdata=new Object[numrow][sh1.getColumns()];

// This will run a loop and each iteration  it will fetch new row
        for(int i=0;i<numrow;i++){

// Fetch first row username
            facebookdata[i][0]=sh1.getCell(0,i).getContents();
// Fetch first row password
            facebookdata[i][1]=sh1.getCell(1,i).getContents();

        }

// Return 2d array object so that test script can use the same
        return facebookdata;
    }

    @AfterTest
    public void QuitTC(){

// close browser after execution
      //  driver.quit();
    }

}
