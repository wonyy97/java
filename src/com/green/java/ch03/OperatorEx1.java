package com.green.java.ch03;

public class OperatorEx1 {
    public static void main(String[] args) {
        int i = 5;
        i++;    //+1
        i++;    //+1
        i++;    //+1  =총 8 이 된다.
        System.out.println(i);

        i = 5;
        ++i;            //증감연산자를 단독으로 사용할 때 읽기 전에 순서는 상관없다 ++i , i++
        System.out.println(i);
    }
}
