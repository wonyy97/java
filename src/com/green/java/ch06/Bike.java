package com.green.java.ch06;

public class Bike {
    //메소드와 생성자 구분 리턴타입이 없고, 클래스명이랑 똑같이 적어야 한다.
    //기본생성자를 넣는 이유는 생성자가 하나도 없기 때문이다.
    //기본생성자가 하나라도 있으면 자동으로 넣어주지 않는다.
    //내가 추가 해야한다.
    //객체를 생성함과 동시에 초기화 하고 싶을때 생성자를 사용한다.

    String brand;  //멤버필드
    String model;
    int price;


    public Bike() {
        this("야마하", "H2-1", 10000); //내가 가지고 있는(내가 상속받고있는) 멤버필드,메소드 호출
    }


    public Bike(String brand,String model,int price) { //생성자
        this.brand = brand;
        this.model = model;
        this.price = price;
    } //this 내 자신의 객체 주소값이 저장된 상수

    public Bike(String brand, int price, String model) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public Bike(Bike bike) {
        this.brand = bike.brand;
        this.model = bike.model;
        this.price = bike.price;
    }

    public Bike(String brand){ //기본생성자가 없다면 jvm이 만들어주지 않는다. 파라미터가 있는 생성자를 쓰고싶으면 강제로 기본생성자를 추가해야한다.
        this.brand = brand;
//        //b2.brand
    }

    void drive() { //메소드
        System.out.printf("%s브랜드 %s모델이 달린다.", brand, model);
    }
}
