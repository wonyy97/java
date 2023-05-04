package com.green.java.ch09;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class WrapperStrudy1 {
    public static void main(String[] args) {
        //primitive type >
        //정수형 > byte, short, int, long
        //실수형 > float, double
        //문자형 > char
        //불린형 > boolean

//        List<int> list = new ArrayList();
        Integer i1 = 10;
        int i2 = 10;
        //멤버필드는 은닉화 되어있기 때문에 메소드만 호출 가능

        String s1 = Integer.toString(i2); //파라미터 1개 타입은 int / toString은 static / 리턴타입 String
        String s2 = i1.toString();

        System.out.println(i1 == i2);

        Byte b1 = 10;
        Short sh1 = 10;
        Long l1 = 10l;
        long l2 = 10;

        Float f1 = 10.1f;
        Double d1 = 10.1;

        Character c1 = 'c';

        Boolean bl1 = true;
    }
}
