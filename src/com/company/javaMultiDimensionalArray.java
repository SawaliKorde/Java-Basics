package com.company;

public class javaMultiDimensionalArray {
    public static void main(String[] args) {
        //creating array objects
        String[][] objects = {{"Mrinal", "Sawali"},{"Rishika", "Pritam"}};
        System.out.println(objects[0][0]);

        for(int i = 0; i< objects.length; i++){
            for(int j = 0;j< objects[i].length; j++ ){
                System.out.println("The array is : " + objects[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
