package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = ' ';
        char grade = ' ', opt = '0';

        System.out.println("점수를 입력하세요 >");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        score = Integer.parseInt(input);


        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        }else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }

        }else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else {
            grade = 'D';
        }

        System.out.printf("입력한 %d의 학점은 %c%c입니다.", score, grade, opt);
    }
}                        //90점보다 크거나 같으면 "학점은 A입니다."
