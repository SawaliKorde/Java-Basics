package com.company;

import java.util.Scanner;

public class Percentage_problem {
    public static void main(String[] args) {
        System.out.println("Enter subject one marks: ");
        Scanner input_marks = new Scanner(System.in);
        float subject1 = input_marks.nextFloat();
        float subject2 = input_marks.nextFloat();
        float subject3 = input_marks.nextFloat();
        float subject4 = input_marks.nextFloat();
        float percentage = (subject1 + subject2 + subject3 + subject4) * 100/400;

        System.out.println("this is total per: " + percentage + "%");

    }
}
