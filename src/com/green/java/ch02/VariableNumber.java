package com.green.java.ch02;

public class VariableNumber {
    public static void main(String[] args) {
        //변수 정수형
        //변수타입(4가지)+변수명(?1)=변수선언
        byte b1;  //1byte = 8bit
        short s1; //2byte
        long l1;  //8byte
        int n1; //(정수형) 변수 선언 / 4byte /int가 제일빠름 CPU가 처리하는게 4byte라서 
        //int n1; -> 변수 선언은 한번만 가능
        n1 = 10; //=은 대입연산자, 오른쪽 값 복사하여 왼쪽에 주입 = 초기화(대입)   /변수값을 변경할 땐 무조건 대입연산자가 필요하다.
        System.out.println(n1);

        n1 = 20; // 20 > 리터럴 값 그 자체
        System.out.println(n1);
    }
}
