package com.green.javasub.sh04;

public class ForQuiz5 {
    public static void main(String[] args) {


        System.out.println();

        int sDan = 2, eDan = 8;
        printGugudan(sDan, eDan);


    }
    static void printGugudan(int sDan, int eDan) {

        for (int i = sDan; i <= eDan; i++) {
            for (int j = 1; j <=9 ; j++) {

                System.out.printf("%d X %d = %d\n",i, j,(i*j) );
            }
            System.out.println();


        }




   }

}



//        int sum = 0;
//        for (int j = i; j == i; j++) {
//            for (int k = 1; k <= 9; k++) {
//                    sum = i*k;
//                System.out.printf("%d X %d= %d\n",i , k, sum);
//            }
