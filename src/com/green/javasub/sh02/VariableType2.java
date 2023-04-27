package com.green.javasub.sh02;

public class VariableType2 {
    public static void main(String[] args) {

        double d1 = 1.0;
        float f1 = 1.0f;
        float f2 = (float) 1.0;

        float f3 = (float) d1;

        //-128~127
        byte b1 = 127;
        byte b2 = (byte) 129;//오버플로우
        System.out.println("b2: "+ b2);

        byte b3 = -128;
        byte b4 = (byte) -129;//언더 플로우
        System.out.println("b4 : " + b4);

        char c1 = 'A'; //문자 하나만 저장, 홑따옴표 사용.
        //char c2 = 'AA'; //문자 두개 저장 X


        boolean bo = true;
        boolean bo2 = false;






    }
}
