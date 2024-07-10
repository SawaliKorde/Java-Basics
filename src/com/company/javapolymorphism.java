package com.company;

public class javapolymorphism {
//    Java doesn’t support operator overloading and hence compile-time polymorphism is not possible in java.
//    But we can overload multiple functions with same name and different parameters or different type of parameters.
public static void main(String[] args) {
    System.out.println(AddMethods.AddNums(2,5));
    System.out.println(AddMethods.AddNums(2,3,4));
    System.out.println(AddMethods.AddNums(5, 6, 7.898989));
}
}

class AddMethods {
    static int AddNums(int a, int b){
        return(a+b);
    }
    static int AddNums(int a, int b , int c){
        return (a + b + c);
    }
    static double AddNums(int a , int b, double c){
        return (a+b+c);
    };

}
