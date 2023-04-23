package com.green.java.ch06;

import java.util.Scanner;

public class BikeTest {

    public static void main(String[] args) {
        //기본 생성자(defult constructor) (파라미터가 하나도 없는) 호출
        // 생성자 생성을 안해도 컴파일러가 알아서 만들어준다.

        int num = Integer.parseInt("12"); //객체화 필요없이 쓸수있다. static
        Scanner scan = new Scanner(System.in); //대문자로 시작하는 . 클래스메소드   static멤버필드
        Bike b1 = new Bike("혼다");

        Bike b2 = new Bike("야마하");

        System.out.println("b1.brand : " + b1.brand);
        System.out.println("b2.brand : " + b2.brand);


    }
}
