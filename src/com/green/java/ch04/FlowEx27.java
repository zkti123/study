package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27 {
         public static void main(String[] args) {
            int num;
            int sum = 0;
            boolean flag = true;//while은 조건식으로 사용
            Scanner sc = new Scanner(System.in);
            System.out.print("합계를 구할 숫자를 입력하세요 (끝내려면 0)\n");
            while(flag){

                System.out.print(">>");
                String input = sc.nextLine();
                num = Integer.parseInt(input);

                if(num == -1){
                    flag =false;
                    System.out.printf(">>합계:%d",sum);
                }else {
                    sum = sum+num;


                }


            }

    }
}
