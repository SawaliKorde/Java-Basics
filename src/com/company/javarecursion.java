package com.company;

public class javarecursion {
    static int Recursive(int num){
        if(num!= 0){
            return num * Recursive(num -1 );
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int res;
        res = Recursive(6);
        System.out.println(res);
    }
}
