package com.green.java.sty;

public class sty1 {

    public static void findPower(int x, int y){
        int result = 1;
        for (int a = 1; a <= y; a++)
            result *=x;
            System.out.println(x + "의"+y+"제곱"+result);

    }

    public static void main(String[] args) {

        int a = 2, b= 10;
        findPower(a,b);
    }

}
