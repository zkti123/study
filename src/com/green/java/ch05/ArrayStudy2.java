package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
      int[] numArr = new int[5];

      for (int i =0; i<numArr.length; i++){
          System.out.println(numArr[i]);
      }

      boolean[] boolArr= new boolean[4]; //
        for (int i =0; i<boolArr.length; i++){
            System.out.println(boolArr[i]);
        }

        String[] strArr = new String[3];
        for (int i =0; i<strArr.length; i++){
            System.out.println(strArr[i]);
        }


    }
}
