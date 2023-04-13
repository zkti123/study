package com.green.java.ch03;

public class OperatorStudy1 {
    public static void main(String args[]){
        int num = 5;

        int result = (4 + num) * 3;

        System.out.println(result);

        num++;

        System.out.println(4+ num * 3);

        num--;

        System.out.println(4 + num * 3);

        num = 4;

        System.out.println(4 + num *3);

        result = 11 / num;
        System.out.println((float) result);

        result = result+2;
        System.out.println(result);

        result = 13 % num;
        System.out.println(result);

    }
}
