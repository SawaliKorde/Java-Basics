package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class javareadfile {
    public static void main(String[] args) {
        try{
            File file = new File("TestFile.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        }catch (FileNotFoundException e) {
            System.out.println("Error not found");
            e.printStackTrace();
        }
    }
}

//delete() method is used to delete file
//public class DeleteFile {
//    public static void main(String[] args) {
//        File file = new File("students.txt");
//        if (file.delete()) {
//            System.out.println("Deleted Sccessfully: " + file.getName());
//        } else {
//            System.out.println("Error......");
//        }
//    }
//}
