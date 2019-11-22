package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserNameTest {

    UserRegistrationValidator validator = new UserRegistrationValidator();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
      boolean result = validator.validateFirstName("Mahendra");
      Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = validator.validateFirstName("mahendra");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenGreaterThanThree_ShouldReturnTrue() {
        boolean result = validator.validateFirstName("Mahendra");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThree_ShouldReturnFalse() {
        boolean result = validator.validateFirstName("ma");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean result = validator.validateLastName("Kundare");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        boolean result = validator.validateLastName("kundare");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean result = validator.validateLastName("kundare");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenGreaterThanThree_ShouldReturnTrue() {
        boolean result = validator.validateLastName("Kundare");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLessThanThree_ShouldReturnFalse() {
        boolean result = validator.validateLastName("Ku");
        Assert.assertFalse(result);
    }



}
