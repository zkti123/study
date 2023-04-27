package com.green.javasub.sh04;

import java.util.Scanner;

public class IfStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = 10000;

        System.out.print("나이를 입력해 주세요");
        int age = scan.nextInt();

        int calcPrice = price;

            if (age<20){
             calcPrice *= 0.9;
            }else if(age>=30){
             calcPrice *=0.8;
            }
            System.out.printf("%d의 나이의 미용 금액은 %,d입니다.",age,calcPrice);


    }
}
