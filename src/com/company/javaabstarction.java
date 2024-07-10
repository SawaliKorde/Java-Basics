package com.company;
//Data abstraction refers to the process of hiding low level details and only displaying important information.
// The abstract keyword is used to declare abstract classes. Abstract classes can have abstract and non-abstract methods.


abstract class Fruits{
    public abstract void taste();
    public void eat(){
        System.out.println("EAT FRUITS");
    }
}

class Mango extends Fruits{
    public void taste(){
        System.out.println("MANGO IS SWEET");
    }
}

public class javaabstarction {
    public static void main(String[] args) {
        Mango m = new Mango();
        m.eat();
        m.taste();
    }
}
