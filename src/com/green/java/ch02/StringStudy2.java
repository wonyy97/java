package com.green.java.ch02;

import java.util.Arrays;

public class StringStudy2 {
    public static void main(String[] args) {
        String str = "  안녕하세요.**저는 김원희** 입니다.  ";
        String r1 = str.replace("*", "").trim(); //체이닝 기법
        System.out.println(r1);

        String str2 = "A:B:C:D:E"; //쪼개기
        String[] strArr = str2.split(":");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[0]);

        String str3 = "AbCdEfG";
        String r2 = str3.toLowerCase();//소문자
        System.out.println("r2 : " + r2);
        String r3 = str3.toUpperCase();//대문자
        System.out.println("r3 : " + r3);

    }
}
