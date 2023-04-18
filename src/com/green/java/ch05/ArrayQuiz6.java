package com.green.java.ch05;

/*
copyArr에 numArr을 deep copy 해주세요
 */
public class ArrayQuiz6 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
//        int[] copyArr = numArr;
        int[] copyArr = new int[numArr.length];

        //deepcopy
        for (int j = 0; j < numArr.length; j++) {
            copyArr[j] = numArr[j];

        }
        numArr[0] = 33;

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);

        }
        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("numArr[%d] > %d\n", i, numArr[i]);
        }
    }
}
