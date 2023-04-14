package com.green.java.ch04;

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:
        for(int i = 2; i <=9; i++){
            for(int j = 1; i <=9; j++){
                if(j==5){
                    break Loop1;
                }
                    System.out.printf("%d, %d\n",i,j);
            }
        }
    }
}
