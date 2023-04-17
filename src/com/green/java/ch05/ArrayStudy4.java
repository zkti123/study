package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] numArr = new int[]{10, 20, 30, 40, 50};
        //int[] copyArr =  numArr;
        int[] copyArr = new int[numArr.length];
        for (int j = 0; j < numArr.length; j++) {
            copyArr[j] = numArr[j];
            numArr[0] = 30;
        }
        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }
    }
}
