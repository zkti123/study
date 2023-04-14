package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
       int input,answer;

        Scanner sc = new Scanner(System.in);
        answer = (int)(Math.random() * 100)+1;
        System.out.println(answer);

        do {
            System.out.print("1~100사이의 정수를 입력 : ");
            input = sc.nextInt();
            if (answer < input) {
                System.out.println("DOWN");
            } else if (answer > input) {
                System.out.println("UP");}
              }

            while (answer != input) ;
            System.out.println("Good");

    }
}
