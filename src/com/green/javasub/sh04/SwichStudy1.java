package com.green.javasub.sh04;

import java.util.Scanner;

public class SwichStudy1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("사용하는 브라우저를 입력해 주세요 : ");
        String smp = scan.nextLine();
        smp = smp.toLowerCase().replaceAll(" "," ");//대문자를 소문자로 바꿔줌 메소드 여러게 연결하는것 체이닝기법

        switch (smp){
            case "edge":
                System.out.println("Edge를 사용하고 계시네요");
                break;
            case "chrome": case "firefox": case "Safari": case "opera":
                System.out.println("저희 서비가 지원하는 브라우저 입니다.");
                break;
            default:
                System.out.println("지원하는 브라우저가 아닙니다.");
        }


    }
}
