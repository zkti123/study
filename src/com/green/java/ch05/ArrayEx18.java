package com.green.java.ch05;

/*
score[0][0] = 100
score[0][1] = 100
score[0][2] = 100
score[1][0] = 20
score[1][1] = 20
score[1][2] = 20
score[2][0] = 30
...
score[3][2] = 40
sum=570
 */
public class ArrayEx18 {

    public static void main(String[] args) {
        int sum = 0;
        int[][] score = { //score[4][3]
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        for (int i = 0; i < score.length; i++) {

            for (int j = 0; j < score[i].length; j++) { //score[i].length = 그 줄에 대한 길이값
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
                sum += score[i][j];
            }
        }
        System.out.printf("sum = %d\n", sum);
    }
}
