package com.green.java.ch07.abstract2;

public class AbstractClassTest1 {
    public static void main(String[] args) {
        //추상클래스는 객체화를 할 수 없다.
//        AbstractClassStudy1 asc1 = new AbstractClassStudy1();
        //반드시 오버라이딩 해야된다.
        //abstract 붙어있으면 무조건 상속자(자식)가 있다.
        //추상클래스는 단일 상속만 가능하다. 인터페이스만 다중상속 가능.
        AbstractClassStudy1 acs1 = new ChildClass();
        acs1.sum(10, 20);

        AbstractClassStudy1 acs2 = new Cild2Class();
        acs2.sum(10, 20);

    }

}
