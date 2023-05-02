package com.green.java.ch06;

public class CarTest {
    public static void main(String[] args) {

        Car.brand = "hahaha";
        System.out.println(Car.brand);

        Car c1 = new Car();
        Car c2 = new Car();

//        c1.brand = "쉐보레";
        c1.model = "트래버스";
        c1.price = 4500;


//        c2.brand = "페라리";  이렇게 사용할 순 있지만 쓰면 안됨
        c2.model = "엔초페라리";
        c2.price = 40_000;

        Car.brand = "현대"; //static은 이렇게 사용해야한다.
        //클래스명.멤버필드

        c1.printInfo();
        c2.printInfo();

        System.out.println(c1.brand);
        System.out.println(c2.brand);


    }
}
