package com.company;

public class javaArray {
    public static void main(String[] args) {
        String[] citynames = {"Mumbai", "Banglore", "Kolkata", "Chennai"};
        int[] numbers = {1,27,31};
        System.out.println("No. of cities: " + citynames.length);
        System.out.println("numbers count " + numbers.length);

        //Accessing Array elements
        System.out.println(numbers[1]);

        //Changing array elements
        citynames[0] = "Delhi";
        System.out.println(citynames[0]);
    }
}
