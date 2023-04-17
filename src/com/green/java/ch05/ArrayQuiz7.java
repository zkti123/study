package com.green.java.ch05;

import java.util.Arrays;

/*
copyArr은 numArr보다 1칸 더 많게 만들어주세요
마지막 방에는 100을 넣어주세요.
copyArr에 numArr을 deep copy 해주세요.
copyArr 값을 모두 출력해 주세요
 */
public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length +1];
        copyArr[numArr.length] = 100;
        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
    String result = Arrays.toString(copyArr);
        System.out.println(result);
    }
}

//        for (int i = 0; i < copyArr.length; i++) {
//
//
//        if(i>= copyArr.length-1){
//            copyArr[i] =100;
//
//}System.out.println(copyArr[i]);
