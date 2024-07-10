package com.company;
import java.util.Scanner;
public class javaMethodLoop {

    static void Marks(int marks) {
        if(marks < 35){
            System.out.println("Failed!");
        } else if(marks > 35 && marks < 60){
            System.out.println("Average");
        } else if (marks > 60){
            System.out.println("Distinction");
        }else{
            System.out.println("Please enter valid input");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        Marks(marks);
    }
}
