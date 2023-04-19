package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {

        int[] numArr = {11, 14, 2, 7, 36, 35};




        for (int k = 0; k < numArr.length; k++) {
            int i = (int)(Math.random()*numArr.length);

            if ( i == k){continue;}

           int tmp = numArr[k];
            numArr[k] = numArr[i];
            numArr[i] = tmp;
        }
         System.out.println(Arrays.toString(numArr));

        }
        }



