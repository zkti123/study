package com.green.java.ch04;

import java.util.Scanner;

//while문 으로 해결
//랜덤값 1~100사이의 랜덤값
//1~100사이의 정수를입력 : 50
//down
//1~100사이의 정수를입력 :25
//up
//1~100사이의 정수를 입력 :30
//good!
//조건식 내가 입력한 값과 랜덤값이 다르다면?
public class WhileQuiz1 {
    public static void main(String[] args) {
        int input , answer ;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        answer = (int)(Math.random() * 100)+1;
        System.out.println(answer);

        System.out.print("1~100사이의 값을 입력하여주세요 : ");
        input = sc.nextInt();

        while (input != answer) {
            if(answer<input){
                System.out.printf("%s보다 작습니다.\n",input);
            } else if (answer>input) {
                System.out.printf("%s보다 큽니다.\n",input);
            }else if(answer==input){
                System.out.printf("%s는 정답입니다.\n",input);
            }
        }


    }
    }
