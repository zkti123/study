package com.green.java.ch05;

import java.util.Arrays;

/*
랜덤값 0~5 넣어서
첫번째 자리수랑 뽑힌 랜덤숫자랑 자리 옮기기
중복 x
 */
public class ArrayQuiz12 {

    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int a = 0;
        int temp =0;
        for (int i = 0; i < numArr.length; i++) {
      temp = (int)(Math.random()*numArr.length);
      a=numArr[temp];
      numArr[temp] = numArr[i];
      numArr[i] = a;

        }

            System.out.println(Arrays.toString(numArr));
        }
    }

