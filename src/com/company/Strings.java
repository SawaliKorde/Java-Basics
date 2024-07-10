package com.company;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        //Strings are immutable and cannot be changed
//        String name = new String("Sawali");
        String name = "Mrinal";
        int value = name.length();
        System.out.println(name);
        System.out.println(value);
//        System.out.println(name1);
        //String methods in java
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString = "    Sawali loves Mrinal";
        String trimmed = nonTrimmedString.trim();
        System.out.println(trimmed);
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));




    }
}
