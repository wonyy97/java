package com.green.java.ch07;

public class GrandChild extends Child {
    public GrandChild() {
        super(1); //부모의 기본생성자 호출
        System.out.println("-- GrandChild 기본 생성자 --");
    }
}
