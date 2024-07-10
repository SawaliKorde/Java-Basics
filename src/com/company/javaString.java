package com.company;

public class javaString {
    public static void main(String[] args) {
        String name;
        name = "Bubyy Mrinal Mintu";
        System.out.println("My name is "+ name);
        newstring.stringmethod();
        concat.concatstring();
        stringMethods.stringmethodtwo();
    }

}

class newstring {
    public static void stringmethod(){
        char[] name = {'M', 'R', 'I', 'N', 'A', 'L'};
        String joint = new String(name);
        System.out.println("Hii " + joint);
    }
}

class concat {
    public static void concatstring(){
        String fname, lname;
        fname = "Sawali";
        lname = "Korde";
        int somenum = 27;
//        System.out.println(fname + " " + lname);
        System.out.println(fname.concat(lname));
        System.out.println(fname + somenum);
    }
}

// FYI - Escape Sequence -- escape character for printing on a new line(\n), inserting a tab(\t), backspacing(\b), etc.

//String Methods

class stringMethods{
    public static void stringmethodtwo(){
        String quote = "To be or not to be is the question";
        String namee = "SAWALI";
        System.out.println(quote.length());
        System.out.println(quote.indexOf("be"));
        System.out.println(namee.toLowerCase());
    }
}