package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 3;
        double r ;

        r = (double)n1/n2;

        System.out.println(r);

        System.out.println("10/3="+ (double)n1/n2);

        System.out.printf("%d나누기%d = " + (float)n1/n2, n1,n2);

        System.out.printf("\n%.3f\n",r);

                //10을 3으로 나눠서 소수점이 나타나도록 해주세요
        //3.0이 나오지않도록
    }
}
