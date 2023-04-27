package com.green.javasub.sh04;

import java.util.Scanner;

public class IfStudy3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = 10000;

        System.out.print("나이를 입력해 주세요");
        int age = scan.nextInt();
        int calcPrice = price;
        int discount = 0;

        if (age<20){
            discount = (int)(price*0.1);
        } else if (age>30) {
            discount = (int) (price*0.2);
        }
        System.out.printf("%d의 나이는",age);
        if (discount>0){

        }


    }
}

//20미만이면 10% 할인 금액
//몇세의 나이는 원금 10,000원에서 할인금액 1,000을 제외한 미용금액 9,000원입니다.
//30이상이면 20% 할인 금액
//몇세의 나이는 원금 10,000원에서 할인금액 2,000을 제외한 미용금액 8,000원입니다.
//나머지는 10,000원 출력
//몇세의 나이는 미용금액 10,000원입니다.

//(천단위 콤마)
