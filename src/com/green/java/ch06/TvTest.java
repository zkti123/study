package com.green.java.ch06;

public class TvTest {
    public static void main(String[] args) {

         Tv tv = new Tv();//tv객체의 주소값만 담을수있다.
        System.out.printf("power : %b\n",tv.power);
        System.out.printf("channel : %d\n",tv.channel);


        tv.power = true;
        System.out.printf("power : %b\n",tv.power);
        tv.power();
        System.out.printf("power : %b\n",tv.power);

        tv.channelUp();
        tv.channelUp();
        System.out.printf("channel : %d\n",tv.channel);
        tv.channel = 10;
        System.out.printf("channel : %d\n",tv.channel);

        Tv tv2 = tv;
        System.out.printf("channel : %d\n",tv.channel);





    }
}
