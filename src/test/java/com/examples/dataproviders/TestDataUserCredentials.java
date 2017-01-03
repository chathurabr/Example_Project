package com.examples.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * Created by janesh on 7/7/2015.
 */
public class TestDataUserCredentials {


    @DataProvider (name = "userCredentials")
    public static Object[][] getDataFromDataProvider() {

        return new Object[][]{
                {"User1", "Password1"},
                {"User2", "Password2"},
                {"User3", "Password3"}

        };
    }

}
