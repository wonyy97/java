package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = fc; //부모는 자식객체를 담을수 있다.
        //타입이 다른경우에 형변환이 가능한 이유는 상속관계라서 그렇다.
       // car.water(); car타입이 알고있는 메소드만 호출할 수 있다.
        //car = new Car(); 부모는 자식의 객체주소값을 받아올 수 없다.
       if(car instanceof FireCar) {  //instanceof Object는 always true
           fc2 = (FireCar) car;
           fc2.water();
       }
    }
}

class Car {
    void drive() {
        System.out.println("drive, Brrrrr~");
    }
    void stop() {
        System.out.println("stop!!");
    }

}


class FireCar extends Car {
    void water() {
        System.out.println("water!~!~!~!");
    }
}