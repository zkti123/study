package com.green.java.ch02;

import java.util.SortedMap;

public class VariableNumber2 {
public static void main(String[] args){
//리터널 Literal, 값 그자체를 리터널이라고한다.

        byte b1;
        b1 = 127;
            System.out.println(b1);
        int i1 ;
        i1 = 128;

        int i2 =(int)b1; //자동 형변환
        b1 = (byte)i1; //byte로 형변환 (byte) 바이트가 -128~ 127 까지 가능한데 형변환을해서 128값을 표현할려다가 보니 오버플로우 되어 -128로 됨 // 강제 형변환
        System.out.println(b1);

    b1 = (byte)-129;
    System.out.println(b1);
}
}