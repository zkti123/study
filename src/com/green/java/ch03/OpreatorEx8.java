package com.green.java.ch03;

import java.text.DecimalFormat;

public class OpreatorEx8 {

    public static void main(String[] args) {

       int a = 1_000_000;
       int b =  1_0_0_0_0_0_0;
       int c = 1000000;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        DecimalFormat df = new DecimalFormat("###,###");
        String money = df.format(c);
        System.out.println(money);








    }
}
