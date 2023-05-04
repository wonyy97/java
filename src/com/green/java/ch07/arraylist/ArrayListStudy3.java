package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1, 100);
        list.add(0, 300);
        System.out.println(list);

        int removeValue = list.remove(4); //삭제한 값을 리턴해줘서 어떤값이 지워졌는지 확인도 할 수 있다.
        System.out.println("removeValue : " + removeValue);

        System.out.println(list);
        System.out.println(list.size()); //배열.length랑 비슷한 것, 배열갯수를 알려준다.
        //리턴타입 int
        list.clear(); //전체삭제  보통 전체삭제의 네이밍을 clear로 준다.
        System.out.println(list);

    }
}
