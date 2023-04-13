package com.green.java.ch04;

public class WhileStudy1 {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            System.out.println("for");
        }
        System.out.println("------------------");

        int i = 0;           // 초기화
        while(i<5){         //조건식
            System.out.println("while");
            i++;        //증감식
        }
    }
}
