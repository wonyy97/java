package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {
    //추상클래스는 단일상속 밖에 안된다. 다중상속안됨
    //추상클래스가 있는순간 class앞에 abstract는 필수이다.
    //객체화를 하고싶지 않을 때 abstract를 쓰기도 한다.
    //추상메소드만 객체화를 못하고 나머지는 객체화할수 있다.
    //추상클래스는 강제성이 있다. 추상메소드 너 꼭 구현해 자식메소드 너 오버라이딩 해
    //추상클래스는 부모 역할만 한다.
    //추상클래스는 무조건 자식이 있다.
    //기본생성자 앞에 private주면 객체화를 막을 수 있다.
    //추상메소드가 아닌 그냥 메소드에 abstract을 붙일수 있다. 그 메소드는 객체화가 안된다.
    int multi(int n1, int n2) {
        return n1 + n2;
    }

    abstract void sum(int n1, int n2);
}

class ChildClass extends AbstractClassStudy1 {

    @Override
    void sum(int n1, int n2) {
        System.out.println("합계 : " + (n1 + n2));

    }
}

class Child2Class extends AbstractClassStudy1 {
    @Override
    void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }
}