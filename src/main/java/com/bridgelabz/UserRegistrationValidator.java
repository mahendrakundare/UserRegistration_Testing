package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidator {


    public boolean validateFirstName(String firstName) {
        Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher match = namePattern.matcher(firstName);
        if (match.matches())
            return true;
        else
            return false;
    }


    public boolean validateLastName(String lastName) {
        Pattern lnamePatter = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = lnamePatter.matcher(lastName);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateEmail(String email ) {
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9][-._+a-zA-Z0-9]*[@]{1}[a-z]*[.]{1}[a-z]{2,3}[.]{0,1}([a-z]{2,3}){0,1}$");
        Matcher matcher = emailPattern.matcher(email);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateMobile(String mobile) {
        Pattern mobilePattern = Pattern.compile("^[0-9]{2,2}[ ][7,8,9]{1,1}[0-9]{9}$");
        Matcher matcher = mobilePattern.matcher(mobile);
        if (matcher.matches())
            return true;
        else
            return false;
    }
}
