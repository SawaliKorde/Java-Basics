package com.company;

import java.io.File;
import java.io.IOException;

public class javafilecreation {
    public static void main(String[] args) {
        try{
            File myObj = new File("TestFile.txt");
            if(myObj.createNewFile()){
                System.out.println("CREATED FILE: " + myObj.getName());
            }else{
                System.out.println("File doesn't exists");
            }
        }catch (IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
