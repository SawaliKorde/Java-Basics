package com.company;

class JavaInheritance {
    static double circle(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}

class Shape extends JavaInheritance {
    static double square(int side) {
        double area = side * side;
        return area;
    }
}

public class Mainn {
    public static void main(String[] args) {
        System.out.println("Circle area: " + Shape.circle(5));
        System.out.println("Square area: " + Shape.square(4));
    }
}


