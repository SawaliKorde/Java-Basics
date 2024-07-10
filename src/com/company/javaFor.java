package com.company;

public class javaFor {
    public static void main(String[] args) {
        for(int i = 0; i<= 10; i++){
            System.out.println(" 2 *" + i+ "=" +2*i);
        }
        javaForeach.printPrime();
    }
}

 class javaForeach {
     public static void printPrime() {
         int[] prime = {1,3,7,5,11,17};
         for(int i: prime){
             System.out.println(i);
         }
     }
}
