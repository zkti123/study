package com.green.java.ch04test;

import java.util.Scanner;
//2.while문사용해서 입력문 사용후 각자리 수의 합
public class WhileTest413_1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

while (num>0){
    sum = num%10;

}
    }
}
