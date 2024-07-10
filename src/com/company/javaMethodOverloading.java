package com.company;

//Method Overloading is when we create multiple methods with the same name but pass different types of parameters inside it.
//        This allows us to load the same methods many times. We only either need to pass a different type or a different number of parameters inside it.
public class javaMethodOverloading {
    static void Details(String name, int marks){
        System.out.println("Welcome " + name + " and your marks are " + marks);
    }
    static void Details(String name, double marks){
        System.out.println("Welcome " + name + " and your marks are " + marks);
    }
    public static void main(String[] args) {
        Details("Sawali",100);
        Details("Mrinal",100.0);
    }
}
