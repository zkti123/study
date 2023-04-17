package com.green.java.ch05;

/*
Arrays.toString 메소드를 이용하지 않고
아래처럼 출력되도록 로직으로 해결하세요
[11, 14, 2, 7, 36, 35]
 */

import java.util.Arrays;

public class ArrayQuiz8 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};//6
        System.out.print("[");
        for (int i = 0; i < numArr.length; i++){
            System.out.printf("%s",numArr[i]);
            if(numArr.length> i+1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("---------------");
        System.out.printf("[%d", numArr[0]);
        for (int i = 1; i < numArr.length ; i++) {
            System.out.printf(",%d",numArr[i]);
        }
        System.out.println("]");
    }
}


//        for (int i = 0; i < copyArr.length; i++) {
//
//
//        if(i>= copyArr.length-1){
//            copyArr[i] =100;
//
//}System.out.println(copyArr[i]);
