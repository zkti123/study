package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요. (1~12)");
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();

        String season = " ";
        switch(mon){
            case 3: case 4: case 5:
                season ="봄";
                break;
            case 6: case7 : case8 :
                season = "여름";
                break;
            case 9 : case 10 : case 11:
                season = "가을";
                break;
            case 1: case 2: case 12:
                season = "겨울";
                break;


            default:
                System.out.println("1~12까지 입력하세요");
        }
        if(!"".equals(season)) {
            System.out.printf("현재 계절은 %s 입니다.\n",season);
        }
    }
}
//mon 값이
//3,4,5라면 "현재의 계절은 봄입니다.
//6,7,8라면 "현재의 계절은 여름입니다.
//9,10,11라면 "현재의 계절은 가을입니다.
//12,1,2라면 현재의 계절은 겨울입니다.