package com.green.java.ch04;

import java.util.Scanner;

public class WhileStudy3 {
    public static void main(String[] args) {
        int input, answer;
        Scanner sc = new Scanner(System.in);
        answer = (int)(Math.random()*100)+1;
        System.out.print(answer);
        while(true){
            System.out.print("\n1~100사이의 정수를 입력: ");
            input = sc.nextInt();

            if(input == answer){break;}
            else if(input > answer){
                System.out.println("down");
            }else if(input < answer){
                System.out.println("up");
            }
        }System.out.println("good!");

    }
}
