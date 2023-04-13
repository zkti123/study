package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        float shortPi2 = (int)pi;
        float shortPi3 = (float)(pi);
        System.out.println(pi);
        System.out.println(shortPi);
        System.out.println(shortPi2);
        System.out.println(shortPi3);
            }
}
