package com.green.java.ch07;

public class Child extends Parent { //단일 상속만 가능
    public Child() {}

    int age;

    public Child(int age) {
        super();//자동 생략
        super.age = age;
        System.out.println("-- Child 기본 생성자 --");
    }

    public int getSuperAge() {
        return super.age;
    }

    public int getThisAge() {
        return this.age;
    }


    void play() {
        System.out.printf("%d살인 아이가 논다.\n", age);
    }
}


