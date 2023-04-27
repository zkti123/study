package com.green.javasub.sh02;

public class VarEx2 {
    public static void main(String[] args) {
        int x =10, y = 20, temp;

        System.out.printf("x: %d y: %d\n", x, y);

        temp = x;
        x = y;
        y= temp;
        System.out.println("x:"+x+"y:"+y);




    }
}
