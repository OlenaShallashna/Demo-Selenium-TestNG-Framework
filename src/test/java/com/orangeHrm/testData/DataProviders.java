package com.orangeHrm.testData;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "Login Invalid Credentials")
    public Object[][] getInvalidCredentials(){
        Object[][] obj = new Object[][]{
                {"invalid", "invalid", ExpectedErrorMessages.INVALID_CREDENTIALS},
                {"", "invalid", ExpectedErrorMessages.EMPTY_USERNAME},
                {"invalid", "", ExpectedErrorMessages.EMPTY_PASSWORD}
        };
        return obj;
    }


}
