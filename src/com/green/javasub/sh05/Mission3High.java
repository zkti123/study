package com.green.javasub.ch05;

import java.util.Scanner;

public class Mission3High {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자입력: ");
        int val1 = scan.nextInt();

        System.out.print("숫자입력: ");
        int val2 = scan.nextInt();

        int min = val1, max = val2;
        if(min > max) {
            min = val2;
            max = val1;
        }
        int sum = sumFromTo(min, max);
        System.out.print(min);
        for(int i = min + 1; i <= max; i++) {
            System.out.printf(", %d", i);
        }
        System.out.println();
        System.out.printf("합계 : %d\n", sum);
    }

    public static int sumFromTo(int min, int max) {
        int minus = max - min;
        if(minus % 2 == 0) {
            return min + sumFromTo(min + 1, max);
        }
        int plus = min + max;
        int half = (int)Math.ceil(minus * 0.5);
        return plus * half;
    }
}
