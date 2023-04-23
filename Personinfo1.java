package com.green.java.sty;

public class Personinfo1 {
    public static void main(String[] args) {
        Personinfo p = new Personinfo("Alice", 30, 123.2);
        p.name= "Alice";
        p.age = 12;
        p.height = 120.5;

        System.out.println("p.name : "+ p.name);
        System.out.println("p.age  : "+ p.age);
        System.out.println("p.height : "+ p.height);
    }
}
