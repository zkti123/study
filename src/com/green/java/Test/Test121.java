package com.green.java.Test;

import java.util.Scanner;

public class Test121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0, n;
        int sum = 0;


        System.out.print("숫자 입력");
        int num = scanner.nextInt();
        System.out.print("숫자 입력");
        int num2 = scanner.nextInt();


        System.out.print("결과 : ");
        for (int i = num; i <= num2; i++) {
            if (i % 2 == 0 || i % 2 == 1) {
                System.out.print(i);

                if (i < num2) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();

        if (num > num2) {
            n = num2;
            num2 = num;
            num = n;
        }
        for (n = num; n <= num2; n++) {
            sum += n;
        }
        System.out.printf("합계 : %d", sum);
    }
}