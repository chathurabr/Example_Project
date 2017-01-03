package com.examples.dataproviders;

import org.testng.annotations.Test;

/**
 * Created by janesh on 7/7/2015.
 */
public class DataFromExternalClass {



    @Test(dataProvider = "userCredentials", dataProviderClass = TestDataUserCredentials.class)
    public void testUserLogin(String userName, String password){
        System.out.println("User name = " + userName + " Password " + password);
    }

}
