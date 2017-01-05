package com.examples.exetel;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Chathura on 1/5/2017.
 */
public class CreditBalance {
    private static String BALANCE;



    @Test
    public void loginTest()throws ConfigurationException {

        Properties properties =new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\Chathura\\IdeaProjects\\Selenium_Example_Full_Project\\Example_Project\\project.properties"));
            BALANCE = properties.getProperty("BALANCE");

            double balance = Double.parseDouble(BALANCE);
            balance = balance - 10;

            System.out.println(balance);


            PropertiesConfiguration config = new PropertiesConfiguration("C:\\Users\\Chathura\\IdeaProjects\\Selenium_Example_Full_Project\\Example_Project\\project.properties");
            config.setProperty("BALANCE",balance);
            config.save();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
