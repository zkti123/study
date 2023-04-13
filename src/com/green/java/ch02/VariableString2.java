package com.green.java.ch02;

public class VariableString2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);
        String s3 = new String("hello");
        String s4 = new String("hello");
        String s5 = new String("hi");

        System.out.println("s3 : " + s3);
        System.out.println("s4 : " + s4);
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3.equals(s4): " + (s3.equals(s4)));
//문자열 비교는 equals ★
        //예약어 사용 금지 (파란색 문자는 예약어)
    //상수는 전부 대문자, 스네이크 케이스 기법
        final int NUM = 13;
    //        NUM = 30; 안됨

    }
}
