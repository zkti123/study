package com.green.javasub.sh04;

import java.util.Scanner;

public class IfStudy1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력해 주세요");
        int num = scan.nextInt();
        String odd = "짝수";

        if (num%2==1){
            odd = "홀수";
        }
        System.out.printf("%d는(은) %s입니다.",num,odd);



    }
}
