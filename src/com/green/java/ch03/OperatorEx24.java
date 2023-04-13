package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        // && and || or ! not
        // (2 > 1) && (2<3) = true
        //(2 > 1) && (3 > 2) && (3 >=5) == false

        //or
        //(2 > 1) || (3>4) == true
boolean a = 2>1;
boolean b = 3>4;
        System.out.println(a||b);

        boolean r1 = (2 >1) && (3 > 2 );
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3>4) == true;
        System.out.printf("r3: %b\n",r3);

    }
}
