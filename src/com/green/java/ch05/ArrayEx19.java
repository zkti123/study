package com.green.java.ch05;

/*
번호 국어 영어 수학 총점 평균
=========================
1   100  90  80 270 100.0
2    20  20  20  60  20.0
...
=========================
총점
국어 : 240
영어 : 230
수학 : 220

 */
public class ArrayEx19 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int avg = 0;
        int[][] score = { //score[4][3]
                {100, 90, 80}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        System.out.println("번호  국어   영어     수학   총점   평균\n=====================================");
        for (int i = 0; i < score.length; i++) {
            System.out.print(i + 1);

            for (int j = 0; j < score[i].length; j++) { //score[i].length = 그 줄에 대한 길이값
                System.out.printf("\t%d\t", score[i][j]);

                for (int k = 0; k < score[i].length; k++) {

                }
                if (i == 0) {
                    sum = sum + score[0][j];
                } else if (i == 1) {
                    sum = sum + score[1][j];
                } else if (i == 2) {
                    sum = sum + score[2][j];
                } else {
                    sum = sum + score[3][j];
                }
            }
            avg = sum / 3;
            System.out.printf("%s\t   ", sum);
            sum = 0;

            System.out.println(avg);
            sum1 += score[i][0];
            sum2 += score[i][1];
            sum3 += score[i][2];
            sum4 = sum1 + sum2 + sum3;
        }
        System.out.println("=====================================");
        System.out.printf("총점: %d\n국어 : %s \n영어 : %d\n수학 : %d\n", sum4, sum1, sum2, sum3);


    }
}
