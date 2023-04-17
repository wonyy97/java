package com.green.java.ch02;

public class VarEx1 {
    //p.21

    public static void main(String[] args) {
        int year = 0;  //변수 선언은 최소 1번만 하면 됨 나머지는 사용
        int age = 14;  // 변수명 age 타입은 int 14값 대입(초기화)

        System.out.println(year); //소괄호가 보이면 메소드라고 의심해라
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}

