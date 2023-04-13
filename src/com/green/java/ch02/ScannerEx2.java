package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name = "성수천";

        System.out.println("나이 입력");
        String input = scan.nextLine();
        int age = Integer.parseInt(input);

        System.out.println("나의 이름은 "+name+"이고 나이는 " + age +"살 입니다");
    }
}
