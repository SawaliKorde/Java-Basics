package com.company;

import java.util.Locale;

public class pr_5 {
    public static void main(String[] args) {
        //Problem 1 - Convert string to lowercase
        String name = "Mrinal Karmokar";
        System.out.println(name.toLowerCase());

        String letter = " Dear <|home|> thanks alot";
        letter = letter.replace("<|home|>","Mrinal");
        System.out.println(letter);

        //Program to detect double and triple spaces in string
    }
}
