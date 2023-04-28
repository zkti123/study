package com.green.javasub.sh04;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int sum =0;
        while (true){
            System.out.print("숫자를 입력(종료:0)");
            int val = scan.nextInt();

            if (val == 0){
                break;

            }sum +=val;



        }System.out.println("합계 : "+sum);




    }
}
