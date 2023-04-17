package com.green.java.ch02;

                // 변수값을 변경할 땐 무조건 대입연산자(=)가 필요하다.

public class VariableChar {
    public static void main(String[] args) {
        //변수 선언과 초기화 동시 가능
        char c1 = 'A'; //문자, "문자열X" , '홑따옴표'사용 /한문자만 사용
        System.out.println(c1);

        c1 = '원';
        System.out.println(c1);

        c1 = 'B';
        System.out.printf("%c : %d \n", c1, (int)c1); //위치를 %로 표시한다.
    }
}
