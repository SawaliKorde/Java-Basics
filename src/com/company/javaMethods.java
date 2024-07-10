package com.company;

import org.w3c.dom.ls.LSOutput;

public class javaMethods {
    static void Details (String name){
        System.out.println("Welcome " + name);
    }
    static long Facts ( int num){
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;

        }
        return fact;
    }
    public static void main(String[] args) {
        Details("Mrinal");
        System.out.println("Factorial of number " + Facts(13) );;

//        [access_modifier] [return_type] methodName([parameters]) {
        // method body
//        }
    }
}
