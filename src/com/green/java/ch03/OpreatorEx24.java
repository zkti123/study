package com.green.java.ch03;

public class OpreatorEx24 {

    public static void main(String[] args) {

       // && 엔드연산자 : 전부 true여야 true가된다, 하나라도 false면 false(false 가 뜨는것을 맨앞에)
        // || or연산자    true 나는것은 맨앞에 두는게 좋다
        // (2 > 1) && (3 > 2) true
        // (2 > 1) && (3 > 2) &&(3>=5) false

        //(2 > 1) || (3 > 2) ||(3>=5) 전부다 false여야 false, 하나라도 true이면 true
        //자주 쓰임

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) &&(3>=5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) ||(3>=5);
        System.out.printf("r3 : %b\n", r3);















    }
}
