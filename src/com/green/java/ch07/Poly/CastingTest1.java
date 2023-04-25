package com.green.java.ch07.Poly;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = fc;//타입이 달라도 형변환이 되는 경우는 상속관계
        //car.water();
        //car = new Car();
        if (car instanceof FireCar) {
            fc2 = (FireCar) car;
            fc2.water();
        }else {
            System.out.println("안돼");
        }
    }
}

class Car {
    void drive() {
        System.out.println("drive,brrrrr~");
    }

    void stop() {
        System.out.println("stop!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!");
    }
}
