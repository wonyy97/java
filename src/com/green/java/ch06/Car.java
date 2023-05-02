package com.green.java.ch06;

public class Car {
    static String brand; //클래스 멤버필드 (객체화 필요없음 메모리에 바로 올라감)
    String model; //인스턴스 멤버필드 (객체화가 필요함)
    int price;  //인스턴스 멤버필드 (객체화가 필요함)

    static void powerOn(){
        Car c = new Car();
        c.model = "현대";
        System.out.println(c.model); //인스턴스 멤버필드 객체화
        System.out.printf("%s 회사의 차 시동 걸림\n", brand);//static 메소드에서 인스턴스변수(멤버필드) 사용불가
    }

    void printInfo() { //인스턴스 멤버 메소드는 static 사용할 수 있다.
        System.out.printf("brand : %s, model : %s, price : %d\n", brand, model, price);
    }
}
