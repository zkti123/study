package com.green.java.ch01;

public class DateTest {
    public static void main(String[] args) {
        int y = 2023, m = 5, d = 27;

        System.out.printf("%s-%s-%s", y, convertTwoNumber(m), convertTwoNumber(d));

//        String sMon = (m < 10 ? "0" : "") + String.valueOf(m);
//        String sDay = (d < 10 ? "0" : "") + String.valueOf(d);
//        System.out.printf("%s-%s-%s", y, sMon, sDay);


//        String sMon = String.valueOf(m);
//        if (m<10){
//            sMon = "0"+ sMon;
//        }
//        String sDay = String.valueOf(d);
//        if (d<10){
//            sDay = "0"+sDay;
//        }
//        System.out.printf("%s-%s-%s",y,sMon,sDay);
//
//    }




    }
    public static String convertTwoNumber(int n){
        return (n < 10 ? "0" : "")+n;
    }
}