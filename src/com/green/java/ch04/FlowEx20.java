package com.green.java.ch04;

public class FlowEx20 {
    public static void main(String[] args) {
       int num = 4;
        for(int i = 1; i<num; i++)
        {
            for(int j =1; j<num; j++){
                System.out.printf("[%d, %d]\t",i,j);
            }
            System.out.println();
        }
    }
}
