package com.green.javasub.sh04;

public class ForQuiz3 {
    public static void main(String[] args) {

        int star = 5;

        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
