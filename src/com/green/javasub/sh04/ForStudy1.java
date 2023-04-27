package com.green.javasub.sh04;

public class ForStudy1 {
    public static void main(String[] args) {

        //for( ; ; ){사이에 있는걸 반복} 무한 루프
        //첫번째는 초기화 자리 두번쨰는 조건식
        // 참이면 ~하는 동안 반복 거짓이면 중단.
        //셋째는 증감식
        for (int i = 0; i < 10; i++) {
            System.out.println("하하"+i);
        }
        System.out.println("===============");
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
        System.out.println("===============");
        for (int i = 0; i < 8; i++) {
            System.out.println(i+1);
        }
        System.out.println("===============");
        for (int i = 15; i < 23; i++) {
             System.out.println(i-14);
        }
        System.out.println("===============");
        for (int i = 30; i > 25; i--) {
            System.out.println(i-25);
        }


    }
}
