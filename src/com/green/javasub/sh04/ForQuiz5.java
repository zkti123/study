package com.green.javasub.sh04;

public class ForQuiz5 {
    public static void main(String[] args) {
            printGugudan(5);
    }
    static void printGugudan(int dan) {

        for (int i = 1; i < 10; i++) {

            System.out.printf("%d X %d = %d\n",dan,i, (dan*i));
        }
//        int sum = 0;
//        for (int j = i; j == i; j++) {
//            for (int k = 1; k <= 9; k++) {
//                    sum = i*k;
//                System.out.printf("%d X %d= %d\n",i , k, sum);
//            }
   }
}
