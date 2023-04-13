package com.green.java.ch04;

public class breakContinueStudy {
    public static void main(String[] args) {
        for(int i = 0 ; i< 10; i++){
            System.out.print(i+", ");
            if(i == 5){
                System.out.println("5에서 멈춘다");
                break;
            }
        }
        System.out.println("----------");
        for(int i = 0; i<10; i++){
            if(i == 5) {
                continue;
            }
            System.out.print(i+ ",");


            }
        }
    }

