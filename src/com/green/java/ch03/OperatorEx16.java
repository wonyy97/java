package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
       float pi = 3.141592f;
       float shortPi = (int)(pi * 1_000) / 1_000f; // * 0.001f; 도 된다.
        // (pi * 1_000) int 형변환 후 소수점 뒷자리 날아가고 1000으로 나눠져서 3.141이 된다.

        System.out.println(pi);
        System.out.println(shortPi);

    }
}
