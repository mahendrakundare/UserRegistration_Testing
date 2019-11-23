package com.bridgelabz;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private String email;
    private static UserRegistrationValidator userRegistrationValidator;
    private boolean expectedResult;

    public EmailValidationTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @BeforeClass
    public static void initialize(){
        userRegistrationValidator  =new UserRegistrationValidator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]>emailData()
    {
        Object[][] emailData = new Object[][]{
                { "abc@yahoo.com" , true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc.100@1.com",true},
                {"abc.abc@gmail.co.in",true},
                {"abc100@gmail.com",true},
                {"abc.100@abc.com.au",true},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@g.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@a.com.21a",false},
                {"abc@g.cim.au.au",false}
        };
        return Arrays.asList(emailData);
    }

    @Test
    public void emailTest() {
        System.out.println("Expected result is  :" + expectedResult);
        boolean result = userRegistrationValidator.validateEmail(this.email);
        Assert.assertEquals(this.expectedResult,result);
    }
}
