package com.green.java.Test;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        Grade grade = new Grade("강백호",90.0,85.5,70.0);
        Grade grade1 = new Grade("채치수",82.0,92.0,60.5);

    }

}

class Grade{
String name;
double a;
double b;
double c;

    public Grade(String name, double a, double b, double c){
        double avg =(a+b+c)/3;
        System.out.printf("%s의 평균점수 : %.2f\n",name, avg);

    }

}
