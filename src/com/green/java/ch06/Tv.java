package com.green.java.ch06;

public class Tv {
    //인스턴스 멤버필드 객체화부터 먼저 해야한다.
    String color;   // null
    boolean power;  // fulse
    int channel;  // 0

    //클래스 멤버필드
    static String brand;

//    Tv() {
//        super(); <- 부모 클래스의 생성자 호출
//    }
        //자동으로 컴파일러가 만들어줌

    void power() {
        power = !power;
    }  //플래그, 스위치

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    } //static이 안붙은 멤버필드를 사용하면 static을 사용하지 못한다.

    void test(String str) {
        System.out.println(str);
    }

    static String getBrand() {
        return brand;
    }

    //static 객체화가 필요없다
    //static이 붙은 멤버필드 멤버메소드는 여기에 없다...?
}
