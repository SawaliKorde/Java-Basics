package com.company;


class Color{
    void paint(){
        System.out.println("Im paintinmg");
    }
}

class RedPaint extends Color{
    void paint(){
        System.out.println("Im painting with RED");
    }
}

class BluePaint extends Color {
    void paint(){
        System.out.println("Im painting in BLUE");
    }
}



public class javaruntimepoly {
    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
    }
}
