package com.green.java.ch06;

public class Tv { //<=타입,객체의 이름
//인스턴스 멤버 필드
    String color;
    boolean power;
    int channel;

    //클래스 멤버 필드
    static String brand;  //Tv 소속 아님

    void power(){power = !power;}
    void channelUp() {++channel;}
    void channelDown(){--channel;}
    void test(String str){
        System.out.println(str);
    }
    static String getBrand(){
        return brand;
    }
}
