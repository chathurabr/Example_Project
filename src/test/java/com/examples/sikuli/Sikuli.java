package com.examples.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

/**
 * Created by Chathura on 1/3/2017.
 */
public class Sikuli {

    public static void main(String[] args) throws FindFailed, InterruptedException {

// We have to create Screen class object to access method

        Screen screen = new Screen();

// Create object of Pattern class and specify the images path

        Pattern imagegoogle = new Pattern("C:\\Users\\Chathura\\Pictures\\feel.PNG");

      /*  Pattern image = new Pattern("C:\\gmail.PNG");

        Pattern image1 = new Pattern("C:\\images\\uname.PNG");

        Pattern image2 = new Pattern("C:\\images\\password.PNG");

        Pattern image3 = new Pattern("C:\\images\\click.PNG");

*/

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


       // driver.manage().window().maximize();

     //   driver.get("https://accounts.google.com");
        driver.get("https://google.com");

       // driver.findElement(By.linkText("සිංහල")).click();

        screen.wait(imagegoogle, 10);

// using screen object we can call click method which will accept image path and will perform //action

// This will click on gmail image on google home page

      //  screen.click(image);

        screen.click(imagegoogle);
      //  screen.type(imagegoogle, "chathura");


// using screen object we can call type  method which will accept image path and content which //we have to type and will perform action.

// This  will type on username field

       // screen.type(image1, "mukeshotwani@gmail.com");

//This will type of password field

       // screen.type(image2, "password1");

// This will click on login button

      //  screen.click(image3);

    }

}
