package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();



        if (score >=90){
            grade = 'A';
        }else if(score>=80){
            grade = 'B';
        }else if(score>=70){
            grade = 'C';
        }else{
            grade = 'D';
        }
        System.out.printf("%d 점의 학점은 %c입니다.\n",score,grade);//출력은 마지막





//        if(score>=90){
//            System.out.printf("%d점의 학점은 %c A 입니다.", score,grade);
//        }else if (score>=80){
//            System.out.printf("%d점의 학점은 %c b입니다.", score,grade);
//        }else if (score>=70){
//            System.out.printf("%d점의 학점은 %c c입니다.", score,grade);
//        } else{
//            System.out.printf("나머지 %d점의 학점은 %c:D입니다.", score,grade);
//        } 사용 X


    }
}
