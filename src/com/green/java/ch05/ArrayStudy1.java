package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열이 무엇인가? 같은 타입에 여러값을 저장하기 위한 공간
        // 서랍을 만들고 그안에 물건을 넣는 느낌
        int n1 = 1, n2 = 2, n3 = 3;
        n1 = 2;
        int[] numArr = {10,20,30};

        numArr[0] = 11; // 0번방을 바꾼다
        int num = numArr[0];
        System.out.println("num: "+num);
    }
}
