package com.green.java.ch06;

public class MyMethod {
    // void > retrun type, 리턴타입
    // sum > method name, 메소드명
    // (int n1, int n2) > parameter, 파라미터, 매개변수, 인자
    // aruments 아규먼츠, 인수

//  (        선언부         )
    void sum(int n1, int n2) {
        if(n1 == 20) {  //{ 구현부 }
//            return; void는 리턴이 자동으로 생김
        }
        System.out.println(n1 + n2);
        return; //메소드 종료
    }

    int sum2(int n1, int n2) {
        return n1 + n2;
    } //리턴 메소드는 리턴값을 데리고 돌아간다
}
