package com.green.java.ch02;

public class Variablestring2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);

        String s3 = new String("hello");  //객체화
        String s4 = new String("hello");


        System.out.println("s3 : " + s3);
        System.out.println("s4 : " + s4);
        System.out.println("s3 == s4 : " + (s3 == s4));
        System.out.println("s3.equals(s4) : " + s3.equals(s4)); //문자열 비교는 무조건 equals      메소드 비교

    }
}
