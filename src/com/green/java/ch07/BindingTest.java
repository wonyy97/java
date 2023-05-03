package com.green.java.ch07;

public class BindingTest { //묶다, 연결하다.
    public static void main(String[] args) {
       Parent2 p = new Child2();
       Child2 c = new Child2();

        System.out.println(p.x);
        p.method();  //타입이 중요한게 아니라 객체가 중요하다.

        System.out.println(c.x);
        c.method();

    }
}


class Parent2 {
    int x = 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;
    @Override //이것을 적어주는 이유가 실제로 오버라이딩이 됐는지 확인해주는 기능을 한다.
    //실제로 이름만 같아도 오버라이딩이 작동이 되지만 정말 실제로 오버라이딩이 됐는지
        // 오버라이딩이 잘 됐는지 검증하는 용도
    void method() {
        System.out.println("Child Method");
    }
    //부모가 가진 메소드 똑같이 들고온것(재정의) 오버라이딩
}