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

    @Test
    public void givenMobile_WhenNotGivenSpace_ShouldReturnFalse() {
        boolean result = validator.validateMobile("918149288245");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobile_WhenPassChar_ShouldReturnFalse() {
        boolean result= validator.validateMobile("abcdere" );
        Assert.assertFalse(result);
    }

}
