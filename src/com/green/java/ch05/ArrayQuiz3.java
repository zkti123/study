package com.green.java.ch05;
/*
numArr배열을 이요하여
짝수번째 방만 콘솔 출력
각 방의 짝수값만 콘솔 출력
14 2 36
 */
public class ArrayQuiz3 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35};

        for (int i = 0; i < numArr.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("numArr[%s] = %s\n", i, numArr[i + 1]);
            }
        }
        System.out.println("----------------");
            for (int j = 0; j < numArr.length ; j++) {
                if (numArr[j] % 2 == 0) {
                    System.out.printf("numArr[%s] = %s\n", j, numArr[j]);
                }
            }
    }
}
