package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidator {


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
}
