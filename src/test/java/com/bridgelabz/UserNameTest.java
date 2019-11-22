package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserNameTest {

    UserNameValidator validator = new UserNameValidator();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
      boolean result = validator.validateFirstName("Mahendra");
      Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        boolean result = validator.validateFirstName("mahendra");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenGreaterThanThree_ShouldReturnFalse() {
        boolean result = validator.validateFirstName("Mahendra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThree_ShouldReturnFalse() {
        boolean result = validator.validateFirstName("ma");
        Assert.assertFalse(result);
    }

}
