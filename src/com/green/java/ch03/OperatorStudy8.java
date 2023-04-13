package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");

        String input = sc.nextLine();
        int num = Integer.parseInt(input);

//
//        if(num%2 == 0){
//            System.out.println("짝수");
//        } else if (num == 0) {
//            System.out.println("0입니다.");
//        } else{
//            System.out.println("홀수");
//        }

      String num1 = num%2 == 1 ? "홀수" : "짝수" ;
      //"홀수" "짝수" 부분은 같은 타입  
        System.out.println("num : " + num1);

    }
}
