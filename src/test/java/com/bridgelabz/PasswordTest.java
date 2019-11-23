package com.bridgelabz;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.tools.javac.code.Attribute;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordTest {
    private String password;
    private static UserRegistrationValidator userRegistrationValidator ;
    private boolean expecteResult;


    public PasswordTest(String password, boolean expecteResult) {
        this.password = password;
        this.expecteResult = expecteResult;
    }

    @BeforeClass
    public static void initialize(){
        userRegistrationValidator  = new UserRegistrationValidator();
    }

    @Parameterized.Parameters
    public static Collection<Object[]>passwordData() {
        Object[][] passwordData = new Object[][]{
                {"Password@123",true},
                {"passWord@123",true},
                {"@passWord123",true},
                {"pass@123Word",true},
                {"@123Password",true},
                {"123Password@",true},
                {"mahi",false},
                {"mahendrakundara",false},
                {"MAHENDRA@123",false},
                {"Mahendra",false},
                {"123456789",false}
        };

        return Arrays.asList(passwordData);
    }

    @Test
    public void passwordTest() {
        System.out.println(" Result for "+password+" is : "+ expecteResult);
        boolean result = userRegistrationValidator.validatePassword(this.password);
        Assert.assertEquals(this.expecteResult,result);
    }
}

