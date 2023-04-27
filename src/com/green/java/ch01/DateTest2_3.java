package com.green.java.ch01;

public class DateTest2_3 {
    public static void main(String[] args) {
        //메소드 버젼
        int y = 2023, m = 4, d = 27;
        System.out.printf("%s-%s-%s", y, convertTwoNumber(m), convertTwoNumber(d));
    }

    public static String convertTwoNumber(int n) {
        return (n < 10 ? "0" : "") + n;
    }
}
