package com.green.java.ch06;

public class Car {
    static String brand; //클래스 멤버필드 (객체화 필요없음 메모리에 바로 올라감)
    String model; //인스턴스 멤버필드 (객체화가 필요함)
    int price;  //인스턴스 멤버필드 (객체화가 필요함)

    static void powerOn(){
        System.out.printf("%s 회사의 차 시동 걸림\n", brand);//static 메소드에서 인스턴스변수 사용불가
    }

    void printInfo() {
        System.out.printf("brand : %s, model : %s, price : %d\n", brand, model, price);
    }
}
