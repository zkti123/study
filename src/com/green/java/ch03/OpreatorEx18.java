package com.green.java.ch03;

public class OpreatorEx18 {

    public static void main(String[] args) {

     double pi = 3.141592;
     double shortPi = Math.round(pi*1000) / 1000.0; //문자열과 소괄호가 같이 있으면 메서드
                                                   // Math.round 반올림해주는기능

        System.out.println(shortPi);

        System.out.println(Math.round(315.4)); //315
        System.out.println(Math.round(315.5)); //316 반올림
        System.out.println(Math.ceil(315.1)); //316.0 올림
        System.out.println(Math.floor(315.9)); //315.0 내림






    }
}
