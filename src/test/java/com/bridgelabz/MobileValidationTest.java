package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MobileValidationTest {

    UserRegistrationValidator validator = new UserRegistrationValidator();

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        boolean result = validator.validateMobile("91 8149288245");
        Assert.assertTrue(result);
    }
}
