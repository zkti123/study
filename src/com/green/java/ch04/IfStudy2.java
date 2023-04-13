package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy2 {
    public static void main(String[] args) {
        String grade = " ";
        String org = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        String input = sc.nextLine();
        int score = Integer.parseInt(input);


        if(score>100 || score<0){

            System.out.println("점수는 0~100점 사이로 입력해주세요");

        }else if(score >=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }

//        if(score >=90){
//            grade = "A";
//        } if(score >= 95){
//            org = "+";
//        }else if(score >= 88){
//            org = "-";
//        }if(score >= 80){
//            grade = "B";
//        }if(score >=85){
//            org ="+";
//        }else if (score >=78){
//            org = "-";
//        }if (score >= 70){
//            grade = "C";
//        }if(score>= 75){
//            org = "+";
//        }else{
//            grade = "F";
//        }
//            System.out.printf("입력한 점수는 %s이고 학점은 %s%s",score,grade,org);
    }
}
