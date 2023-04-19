package com.green.java.ch06;

public class MyMethod {

    void sum(int n1, int n2) {
        if(n1 == 20) {
            return;
        }
        System.out.println(n1 + n2);
        return; //메소드 종료
    }

    int sum2(int n1, int n2) {
        return n1 + n2;
    }
}
