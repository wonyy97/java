package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args) {
        String r1 = "안녕" + 1 + 1;
          // string타입 + 정수타입     형변환이 이루어지면 정수인 1이 string으로 변환
          // string r1 = "안녕1" + 1;
          // string r1 = "안녕11";
        System.out.println(r1);

        String r2 = "안녕" + (1 + 1);  //(소괄호)안에 있는 것 부터 실행된다.
        System.out.println(r2);

        String r3 = 1 + 1 + "안녕";
        System.out.println(r3);
    }
}
