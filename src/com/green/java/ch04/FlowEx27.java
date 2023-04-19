package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num ;
        int sum = 0;
        boolean flag = true; // while 조건식으로 사용하세요.
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0)");

        while (flag){
            System.out.print(">>");
            num = scan.nextInt();

            if (num==0){
                flag = false;
            }else{
                sum +=num;
            }
        }
        System.out.println("합계 :"+ sum);



    }
}
//        while(flag){
//            System.out.print(">>");
//            String tmp = scan.nextLine();
//            num = Integer.parseInt(tmp);
//
//            if (num>0){
//            sum += num;}
//            else {
//                flag = false;
//            }
//
//
//        }System.out.printf("%d",sum);

//
//        while(flag){
//            System.out.print(">>");
//             num = scan.nextInt();
//
//            if (num>0){
//                sum += num;}
//            else {
//                break;}
//
//        }System.out.printf("합계 :%d",sum);