package com.green.java.ch07;

public class MyTv extends Speaker{
    int channel;

    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }

    class  MyTv2{
        int channel;

        void channelUp(){
            channel++;
        }
        void channelDown(){
            channel--;
        }

        Speaker speaker;
        void volunmUp(){speaker.VolumnUp();}
        void volunmDown(){speaker.VolumnDown();}

    }
}
class Speaker{
    int volumn;

    void VolumnUp(){volumn++;}

    void VolumnDown(){ volumn--;}

}
