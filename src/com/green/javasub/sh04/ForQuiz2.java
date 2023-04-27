package com.green.javasub.sh04;

public class ForQuiz2 {
    public static void main(String[] args) {
        int star = 5;
        final int Row_cnt = 5;
        int max = star * star;
        for (int i = 1; i <= max; i++) {
            System.out.print("*");
            if (i%Row_cnt==0){
                System.out.println();
            }
        }
        System.out.println("========================");
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================");


    }
}
