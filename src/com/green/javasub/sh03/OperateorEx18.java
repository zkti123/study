package com.green.javasub.sh03;

public class OperateorEx18 {
    public static void main(String[] args) {
     double pi = 3.131592;



        System.out.println("r1:"+Math.round(pi));//반올림 시킴
        System.out.println("r2:"+Math.round(3.5111));//반올림 시킴
        System.out.println("Math.ceil(pi):"+Math.ceil(pi));//올림 처리
        System.out.println("Math.ceil(3.000000):"+Math.ceil(3.000000));//소수점에 값이 없으면올림 처리 안됨
        System.out.println("Math.ceil(3.0001):"+Math.ceil(3.0001));
        System.out.println("Math.floor(3.0001):"+Math.floor(3.0001));//내림
        System.out.println("Math.floor(3.9999):"+Math.floor(3.9999));//내림



    }
}
