package com.green.java.ch04;

public class BreakContinueStudy1 {
    public static void main(String[] args) {

        for (int i = 0; i<10; i++){
            System.out.print(i+",");

            if (i==5){
                System.out.println("\n5에서 끝!");
                break;
            }
        }
        System.out.println("----------------");
        for (int i=0; i<10; i++){
            if(i ==5){
                continue;//5스킵 바로 i++로 간다
            }
            System.out.print(i+", ");
        }
    }
}
