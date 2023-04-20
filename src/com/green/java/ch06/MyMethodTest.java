package com.green.java.ch06;

import java.io.PrintStream;

public class MyMethodTest {
    public static void main(String[] args) {

        MyMethod mm = new MyMethod();
        mm.sum(10,20);
        mm.sum(10,40);//여러번 사용이 가능하다.
        //void 메서드는 양쪽에 뭘 붙일수 없다.

        int result = mm.sum2(10,245);
        System.out.println("result : "+result);

        //PrintStream ps = System.out;
        //ps.println("result : " +result);  sout와 같다

    }
}
