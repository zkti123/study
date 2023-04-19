package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input , answer ;

        Scanner scan = new Scanner(System.in);

        answer = (int) (Math.random()*100)+1;



        do {
            System.out.print("1~100사이의 정수를 입력 :");
            input = scan.nextInt();
            if (input < answer) {
                System.out.println("up");
            } else if (input > answer) {
                System.out.println("down");
            }
        }while (input !=answer );
        System.out.println("good");






//        answer = (int)(Math.random()*100)+1;
//        System.out.println(answer);
//
//        System.out.print("1~100사이의 정수를 입력 :");
//        input= scan.nextInt();
//
//        while (input != answer){
//            if(input>answer){
//                System.out.println("down");
//            }else if(input<answer){
//                System.out.println("up");
//            }
//            System.out.print("1~100사이의 정수를 입력 :");
//            input= scan.nextInt();
//        }
//        System.out.println("good!");



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