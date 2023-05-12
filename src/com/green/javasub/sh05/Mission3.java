package com.green.javasub.ch05;

import java.util.Scanner;

public class Mission3 {
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
        int sum = min;
        System.out.print(min);
        for(int i = min + 1; i <= max; i++) {
            sum += i;
            System.out.printf(", %d", i);
        }
        System.out.println();
        System.out.printf("합계 : %d\n", sum);
    }
}
