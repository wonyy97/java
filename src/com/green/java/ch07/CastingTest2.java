package com.green.java.ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car.drive();
//        fc = (FireCar)car; 부모는 자식의 객체주소값을 담을 수 없다.

    }
}


