package com.green.javasub.sh03;

public class OperateorEx32 {
    public static void main(String[] args) {

        String gender = "w";

        String gederTitle = "w".equals(gender) ? "여성" : "남성";
        System.out.println(gederTitle);


        int x = 10, y = -5;
        int absX = x>0 ? x:-x;
        int absY = y>0 ? y:-y;

        System.out.println("absX :" + absX);
        System.out.println("absY :" + absY);

    }
}
