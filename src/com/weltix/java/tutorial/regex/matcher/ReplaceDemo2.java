package com.weltix.java.tutorial.regex.matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ASUS on 16.02.15.
 */
public class ReplaceDemo2 {

    private static String REGEX = "a*b";
    private static String INPUT =
            "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
