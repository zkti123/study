package com.green.java.ch07.Poly;

public class Poly {
    /* 다형성, 상속관계에서만 의미 있음.
        1. 부모 타입은 자식 객체 주소값 저장할 수 있다.
        2. 자식 타입은 부모 객체 주소값 저장할 수 없다.
        3. 타입은 (알고 있는 메소드만 호출할 수 있다)
        (메소드를 호출할 수 있나없나만 결정) =>> 실제로 실행되는 건 객체 기준이다.
     */
    public static void main(String[] args) {
        Animal ani1 = new Dog();
        ani1.crying();
        //ani1.jump; 사용 X 안됨

        //Dog dog1 = new Animal(); 사용 X 안됨
        Dog dog1 = (Dog) ani1;
        dog1.crying();
        dog1.jump();


    }
}
