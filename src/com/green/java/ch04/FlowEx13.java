package com.green.java.ch04;

public class FlowEx13 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i=1; i<101; i++){
            //sum = sum + i;
            sum += i;//축약형 sum + i
            System.out.printf("1부터 %2d까지의 합 : %2d\n",i,sum);
        }

    }
}
