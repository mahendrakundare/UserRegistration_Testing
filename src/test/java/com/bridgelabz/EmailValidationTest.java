package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class EmailValidationTest {

    UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = validator.validateEmail("abc.bridgelabz.com");
        Assert.assertTrue(result);
    }

    @Parameterized.Parameters
    public void name() {
    }
}
