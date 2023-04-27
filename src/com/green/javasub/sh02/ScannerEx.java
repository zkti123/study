package com.green.javasub.sh02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();
        //입력한 값이 변수에 삽입이된다
        System.out.printf("두 자리 정수를 입력해 주세요>");
        String input = scan.nextLine();

        System.out.println("input : "+input);
        System.out.println(input +input);


        int num = Integer.parseInt(input);

        System.out.println(num+num);

    }
}
