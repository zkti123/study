package com.green.java.ch05;
/*
모든 방값 중에 홀수값만 전부 더해서 출력해 주세요

odd-sum: ??
 */
public class ArrayQuiz5 {

    public static void main(String[] args) {
        int sum =0;
        int[] numArr = {11,14,2,7,36,35};
        for (int i = 0; i < numArr.length ; i++) {
            if(numArr[i]%2 !=0){
            sum =sum+numArr[i];

            }
        }
        System.out.printf("odd-sum: %s ",sum);
    }
}
