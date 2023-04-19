package com.green.java.ch05;

public class ArrayQuiz2 {
    public static void main(String[] args) {

        int[] rNumArr = new int[6];



//        for (int i =0; i<rNumArr.length; i++){
//            rNumArr[i] =(int)(Math.random()*45)+1;
//            System.out.print(rNumArr[i]); //값과 출력은 따로
//            if (i<rNumArr.length-1){
//                System.out.print(",");
//            }
//        }
        for (int i = 0; i < rNumArr.length; i++) {
            rNumArr[i] = (int)(Math.random()*45)+1;
        }
        for (int i = 0; i < rNumArr.length; i++) {
            System.out.print(rNumArr[i]);
            if (i<rNumArr.length-1){
                System.out.print(",");
            }

        }
    }
}
