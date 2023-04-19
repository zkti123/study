package com.green.java.ch04.ch04T;

import java.util.Scanner;

//class ScoreObj2 {
//    String getGrade(int score) {
//
//

//        String tmp = "0";
//        String opt = "0";
//
//        if (score > 100 || score < 0) {
//            System.out.println("점수는 0~100점 사이입니다.");
//        } else {
//            if (score >= 90) {
//                tmp= "A";
//            } else if (score >= 80) {
//                tmp= "B";
//            } else if (score >= 70) {
//                tmp= "C";
//            }else {
//                tmp = "D";
//            }
//        }
//
//        int num = score % 10;
//        if (score != 'D') {
//            if (num >= 8 || score == 100) {
//                opt =  "+";
//            } else if (num < 4) {
//                opt= "-";
//            }
//        }
//         return tmp+opt;
//        }
//}

//public class FlowEx5Method {
//    public static void main(String[] args) {
//        int score = 0;
//
//        System.out.print("점수를 입력하세요 > ");
//        Scanner scan = new Scanner(System.in);
//        score = scan.nextInt();
//
//        ScoreObj2_1 so = new ScoreObj2_1();
//        String result = so.getGrade(score);
//        System.out.println(score+"점의 학점은" + result);
//





            // 100점 > A+
            // 90점 보다 크거나 같으면 "%d점의 학점은 A+입니다."
            // 80점 보다 크거나 같으면 "%d점의 학점은 B-입니다."
            // 70점 보다 크거나 같으면 "%d점의 학점은 C0입니다."
            // 70점 미만 opt 없음 무조건 D학점, 나머지 "%d점의 학점은 D입니다."

            //1의 3자리가 8점이상 +, 4미만 -, 나머지 0

//        }
//    }

