package com.green.java.ch07.Poly;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
        //fc = (FireCar)car;//자식은 부모을 담을수 없다.
    }
}
