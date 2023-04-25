package com.green.java.ch06;

public class Tv {
        //인스턴스 멤버필드
        String color;   // null
        boolean power;  // fulse
        int channel;  // 0

        //클래스 멤버필드
        static String brand;

        void power() {power = !power;}  //플래그, 스위치
        void channelUp() {++channel;}
        void channelDown() {--channel;} //static이 안붙은 멤버필드를 사용하면 static을 사용하지 못한다.
        void test(String str) {
                System.out.println(str);
        }

        static String getBrand() {
                return brand;
        }


}
