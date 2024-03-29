package com.green.java.ch07.Poly;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        p.Method();
        c.Method(5);

    }
}

class Parent3{
    protected int x = 100;
    void Method(){
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3{
    private int x = 200;

    void Method(int x){
        System.out.println("x="+x);
        System.out.println("super.x="+super.x);
        System.out.println("this.x="+this.x);

    }
}