package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz7 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, 35, 80, 90,21};//9개
        int[] copyArr = new int[numArr.length+1];//10개

        copyArr[numArr.length] = 100;
        //copyArr[copyArr.length - 1] = 100; //마지막 방번호 -1

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        String reult = Arrays.toString(copyArr);
        System.out.println(reult);



        }

    }
