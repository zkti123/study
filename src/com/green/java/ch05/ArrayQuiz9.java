package com.green.java.ch05;

import java.util.Arrays;

/*
numArr 배열을 이용하여
값 리터널 x
0번방 1번방 값 스와이핑
 */
public class ArrayQuiz9 {

    public static void main(String[] args) {
        int[] numArr = {11,14,2,7,36,35};
        int[] blank = new int[numArr.length];

        //numArr = new int[numArr.length];

        for(int i=0; i < numArr.length; i++){
            int temp =numArr[1];//14/14

            numArr[0] = temp;//11//14
            numArr[1] =  numArr[0];
        }



        System.out.println(Arrays.toString(numArr));
    }
}
