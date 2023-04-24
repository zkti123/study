package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child ch = new Child(10);
        ch.age = 20;

        System.out.printf("super  :%d\n",ch.getSuperAge());
        System.out.printf("this  :%d\n",ch.getthisAge());

    }
}
//super : .과 ()가 있다 멤버필드 읽기쓰기,멤버메소드 호출
//this . : 매개 변수와 객체 자신이 가지고 있는 변수의 이름이
// 같은 겨우 이를 구분하기 위해 this 를 붙인다
//this () : 자기자신의 생성자 호출.