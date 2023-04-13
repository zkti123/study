package com.green.java.ch04;

public class IfStudy1 {
    public static void main(String[] args) {
        int num = 9;
        if(num == 10){
            System.out.println("num은 10입니다.");
        } else if (num<10 && num >0) {
            System.out.println("num값은 10보다 작고 0보다 큽니다.");
        }else{
            System.out.println("다시입력하여주세요");
        }
        int num2 = 10;
        if(num2 >= 20){
            System.out.println("num2은 20와 같거나큽니다.");
        } else if(num2 >=10){
            System.out.println("num2은 10와 같거나 큽니다.");

        } else if(num2 >= 5){
            System.out.println("num2은 5와 같거나 큽니다");

        }else{
            System.out.println("끝");
            
        }
    }
}
