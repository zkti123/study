package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력");
                String input = scanner.nextLine();
                num = Integer.parseInt(input);

        System.out.println("입력내용 :"+ input);
        System.out.printf("num=%d\n", num);


    }
}