package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        System.out.println("점수를 입력하세요 >");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.printf("입력한 %d의 학점은 %s입니다.",score,grade);
        //90점보다 크거나 같으면 "학점은 A입니다."
    }
}



