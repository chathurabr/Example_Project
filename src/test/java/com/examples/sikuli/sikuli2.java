package com.examples.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

/**
 * Created by Chathura on 1/3/2017.
 */
public class sikuli2 {
    @Test

    public void functionName() throws FindFailed {



// Create a new instance of the Firefox driver
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();



// And now use this to visit Google

        driver.get("http://www.google.com");



//Create and initialize an instance of Screen object

        Screen screen = new Screen();



//Add image path

        Pattern image = new Pattern("C:\\Users\\Chathura\\Pictures\\feel.PNG");



//Wait 10ms for image

        screen.wait(image, 10);



//Click on the image

        screen.click(image);

    }

}
