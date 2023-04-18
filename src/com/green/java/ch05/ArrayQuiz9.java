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
        int[] blank = new int[numArr.length];//6
        int temp = 0;
        //numArr = new int[numArr.length];
            temp= numArr[0]; // 11->0 temp = 11
            numArr[0]=numArr[1]; // blank[1] = 14 -> blank[0] =14
            numArr[1]=temp;





        System.out.println(Arrays.toString(numArr));
    }
}
