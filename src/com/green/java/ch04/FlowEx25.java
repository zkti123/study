package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (예: 12345) > ");
        String temp = sc.nextLine();
        num = Integer.parseInt(temp);


        while(num>0){
            sum = sum+(num%10);
            num = num/10;
            System.out.printf("입력한 num의값은 %s, 나머지는 %d",num,sum);
            System.out.println("");
}
        System.out.println("각 자리의 수의 합 : " +sum);
    }
}