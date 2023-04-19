package com.green.java.ch05;

public class ArrayEx19 {
    public static void main(String[] args) {
        String[] titles = {"국어","영어","수학"};
        int [] titleSumArr = new int[titles.length];
       int[][] score = {
               {100, 90, 80,},
               {20, 20, 20,},
               {30, 30, 30,},
               {40, 40, 40,}
       };
        System.out.print("번호\t");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s\t",titles[i]);
        }
        System.out.println("평균\n");
        System.out.println("==========================");
        for (int i = 0; i < score.length; i++) {
            int[] eachscore = score[i];
            int sum = 0;
            System.out.printf("%3d\t",i+1);
            for (int j = 0; j < eachscore.length; j++) {
                int jumsu = eachscore[j];
                System.out.printf("%d\t",jumsu);
                sum += jumsu;
                titleSumArr[j] += jumsu;
            }System.out.printf("%3d\t%4.1f\n", sum, ((double)sum / eachscore.length));
        }
        System.out.println("총점");
        System.out.println("=================");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s : %d\n",titles[i],titleSumArr[i]);
        }



    }
}
