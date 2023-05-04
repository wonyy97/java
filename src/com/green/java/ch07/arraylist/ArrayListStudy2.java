package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = a;

        double d = 10.2;
        Double d2 = d;

        //generic<제네릭>
        List<Integer> list = new ArrayList<>();
        //list.add("11");
        //list.add("10.1");
        //list.add("ture");
        list.add(10);  //오로지 정수값만 입력가능하다.(Integer)
        list.add(13);

        int n1 = list.get(0); //리턴값이 정수값이라서 형변환이 필요없다.
        System.out.println(list);  //toString이 @Override 되어있다.
    }
}
