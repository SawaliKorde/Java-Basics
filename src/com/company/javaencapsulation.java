package com.company;

//To encapsulate something is to enclose something, in our case,
// we encapsulate or wrap data into a single unit essentially binding the data and code together.

public class javaencapsulation {
    private String name;
    int age;
    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
