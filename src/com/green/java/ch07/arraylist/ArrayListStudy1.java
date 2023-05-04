package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        List list = new ArrayList();  //받는타입이 Object타입 개나소나 다 넘길수 있다.
        //타입이 다른데 객체값을 받을수 있으면 무조건 상속관계,
        //수정이 많을 때는 linkedlist, 읽는게 많을 때는 arraylist
        list.add(10); // 0번방
        list.add(20); // 1번방
        list.add("ddd");

        Object obj = 10;
        //add 하고 get으로 빼내기 add, get은 둘다 메소드
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        Object o1 = list.get(0); //오브젝트로 받으면 형변환 필요없다.
        int n1 = (int)list.get(0); //타입을 잘 보고 형변환 해야한다.
        int n2 = (int)list.get(1);
        String str1 = (String)list.get(2);

    }
}
