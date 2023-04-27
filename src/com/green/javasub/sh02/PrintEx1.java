package com.green.javasub.sh02;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        char c = 'A';
        int finger = 11;
        long big = 100_000_000_000l;
        long big2 = 100000000000l;


        System.out.printf("b = %d\n", b);
        System.out.println("b = "+b);

        System.out.printf("b = %d, c= %c\n",b,c);

        System.out.println("b = "+b +", c ="+ c);

        System.out.printf("c = %c, %d\n",c , (int)c);
        System.out.printf("finger = [%d]\n", finger);
        System.out.printf("finger = [%5d]\n", finger);
        System.out.printf("finger = [%-5d]\n", finger);
        System.out.printf("finger = [%-5d]\n", 123);// 자릿수가 적을때만 의미가 있다.
        System.out.printf("finger = [%05d]\n", finger);
        System.out.printf("mon = [%02d]\n", 1);
        System.out.printf("mon = [%02d]\n", 12);

        System.out.printf("mon = %4d-%02d-%02d\n",2023, 4, 2);
        System.out.printf("mon = %4d-%02d-%02d\n",2023, 11, 12);

        System.out.printf("%d\n", big2);
        System.out.printf("%,d\n", big2);





    }
}
