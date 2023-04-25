package com.green.java.ch07.Poly;

public class Animal {
    private String name;



    public void crying(){
        System.out.println("동물이 운다");
    }

}class Dog extends Animal{

    @Override
    public void crying() {
        System.out.println("멍멍멍");
    }
    public void jump(){
        System.out.println("개가 점프");
    }
}
class Bulldog extends Dog{
    @Override
    public void crying() {
    System.out.println("으르렁");
}

}
class Cat extends Animal{
    @Override
    public void crying() {
        System.out.println("야옹");
    }

}
class Duck extends Animal{
    @Override
    public void crying() {
        System.out.println("꽥꽥");
    }

}
