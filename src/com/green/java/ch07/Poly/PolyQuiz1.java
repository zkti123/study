package com.green.java.ch07.Poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
    Dog dog1 = new Dog();
    Bulldog bd1 = new Bulldog();
    Cat cat1 = new Cat();
    Duck duck1 = new Duck();


    Animal ani = dog1;
    ani = bd1;
    ani = cat1;
    ani = duck1;

    animalCryingCall(dog1);
    animalCryingCall(bd1);
    animalCryingCall(cat1);
    animalCryingCall(duck1);
    }
    static void animalCryingCall(Animal ani){
        ani.crying();

       if (ani instanceof Dog){
           Dog dog = (Dog) ani;
           dog.jump();
       }


    }
}

