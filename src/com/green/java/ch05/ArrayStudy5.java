package com.green.java.ch05;

public class ArrayStudy5 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        //얕은복사
        //깊은 복사 : 기존 배열과 같은 크기 가있어야된다
      int[] numArr = new int[]{10,20,30,40,50};
      int[] copyArr = new int[numArr.length]; //깊은 복사 copyArr = 0


        copyArr[0] = 414;
        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n",i ,copyArr[i]);
        }








    }
}
