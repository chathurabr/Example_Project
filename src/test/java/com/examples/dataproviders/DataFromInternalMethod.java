package com.examples.dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by janesh on 7/7/2015.
 */
public class DataFromInternalMethod {




    @Test (dataProvider ="userCredentials")
    public void testUserLogin(String userName, String password){
        System.out.println("User name " + userName);
        System.out.println("Password " + password);
    }



    @DataProvider(name="userCredentials")
    public Object[][] getDataFromDataProvider(){

        return new Object[][]{
                {"user1","password1"},
                {"user2","password2"},
                {"user3","password3"},
                {"user4","password4"}

        };

    }


}
