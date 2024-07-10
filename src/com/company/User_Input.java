package com.company;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String a = input.next();
        System.out.println("Your name is " + a);
    }
}
