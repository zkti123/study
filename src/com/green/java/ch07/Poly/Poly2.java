package com.green.java.ch07.Poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();

       boolean r1 = ani1 instanceof Bulldog;
        System.out.println("r1 : "+ r1);
        Bulldog bd1 = (Bulldog)ani1;

        System.out.println("r2 : " + (ani1 instanceof Cat)); //형변환은 위아래 상속관계만 가능
        //Cat c1 = (Cat)ani1;
    }
}
