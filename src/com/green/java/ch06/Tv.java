package com.green.java.ch06;

public class Tv { //<=타입,객체의 이름

    String color;
    boolean power;
    int channel;


    void power(){power = !power;}
    void channelUp() {++channel;}
    void channelDown(){--channel;}

}
