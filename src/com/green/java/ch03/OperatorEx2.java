package com.green.java.ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;
        j = i++;     // 뒷쪽에 ++이 있으면 원래 있던 숫자(i)를 먼저 사용하고 +1이 올라간다. i 먼저 실행되서 리턴된 다음에 ++가 실행된다
        System.out.printf("j=i++; 실행 후 i=%d, j=%d\n", i ,j);


        int i2 = 5, j2 = 0;
        j2 = ++i2;
        System.out.printf("j2=i2++; 실행 후 i2=%d, j2=%d\n", i2 ,j2);
    }
}
