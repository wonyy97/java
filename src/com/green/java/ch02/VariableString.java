package com.green.java.ch02;
            //★주소값
public class VariableString {
    public static void main(String[] args) {
        String s1 = "Hello";      // 대문자로 시작되는것은 주소값 저장
        String s2 = "World";

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1 + s2;
        // String s3 = "HelloWorld";
        System.out.println(s3);


        String s4 = s1 + " " + s2;     //문자열 합치기를 할 때 +가 쓰인다 / 연산자에도 우선순위가 있다. / +는 왼쪽부터 실행된다.
        System.out.println(s4);
    }
}
