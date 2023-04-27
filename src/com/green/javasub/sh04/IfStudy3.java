package com.green.javasub.sh04;

import java.util.Scanner;

public class IfStudy3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = 10000;

        System.out.print("나이를 입력해 주세요");
        int age = scan.nextInt();
        int calcPrice = price;
        int amp = price;




            if (age>20 && age<30) {
                System.out.printf("%d의 나이는 미용금액 %,d입니다.",age,price);
            }else {
                if (age<20){
                    calcPrice *= 0.9;
                    amp *= 0.1;
                }else if(age>=30){
                    calcPrice *=0.8;
                    amp *= 0.2;
                }
                System .out.printf("%d의 나이는 원금 %,d원에서 할인 금액 %,d원을 제외한  미용 금액은 %,d원입니다.",age,price,amp,calcPrice);
            }







    }
}
