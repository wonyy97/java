package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListStudy4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1,50);

        System.out.println(list.contains(10)); //입력값이 배열안에 있는지 확인하는 것
        //contains 리턴타입 boolean

        System.out.println(list);

        Integer[] arr2 = {10, 20, 30};
        System.out.println(Arrays.asList(arr2).contains(20));
    }
}
