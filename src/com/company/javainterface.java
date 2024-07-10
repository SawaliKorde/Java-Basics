package com.company;

//https://www.codewithharry.com/tutorial/java-abstraction/ - Refer for details

interface Fruits1{
    public abstract void taste();
    public void eat();
}

class Mango1 implements Fruits1{

    public void taste(){
        System.out.println("MANGO IS YUM");
    }
    public void eat(){
        System.out.println("EAT FRUITS");
    }
}

public class javainterface {
    public static void main(String[] args) {
        Mango1 m = new Mango1();
        m.eat();
        m.taste();
    }
}
