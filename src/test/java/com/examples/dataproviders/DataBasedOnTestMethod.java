package com.examples.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by janesh on 7/7/2015.
 */
public class DataBasedOnTestMethod {


    @Test(dataProvider = "userCredentials")
    public void testLogin1(String userName, String password){
        System.out.println("User Name " + userName + " Password " + password);
    }


    @Test(dataProvider = "userCredentials")
    public void testLogin2(String userName, String password){
        System.out.println("User Name " + userName + " Password " + password);
    }


    @DataProvider(name = "userCredentials")
    public Object[][] getDataProvider(Method method){
        if(method.getName().equalsIgnoreCase("testLogin1")) {
            return new Object[][]{
                    {"USER1", "PASSWORD1"},
                    {"USER2", "PASSWORD2"},
                    {"USER3", "PASSWORD3"}
            };
        } else {
            return new Object[][]{
                    {"user1", "password1"},
                    {"user2", "password2"},
                    {"user3", "password3"}
            };
        }
    }

}
