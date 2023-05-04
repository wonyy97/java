package com.green.java.ch07.poly;
//p.354  다형성, 상속관계에서만 의미가 있다.
public class Poly {
    /*
        1. 부모타입은 자식 객체주소값 저장할 수 있다.
        2. 자식타입은 부모 객체주소값 저장할 수 없다. 자식은 부모보다 작아질 수 없다.
        3. 타입은 (알고있는 메소드만 호출할 수 있음)
                (메소드를 호출할 수 있나없나만 결정)
                >> 실제 실행되는 건 객체 기준이다.
    */
    public static void main(String[] args) {
        Animal ani1 = new Dog(); //타입이 달라도 객체주소값을 저장할 수 있는 경우가 있다. 그게 상속관계
        ani1.crying(); //타입기준이 아닌 객체기준
        //ani1.jump(); //animal에는 jump타입이 없어서 호출 불가능

        //Dog dog1 = new Animal();
        //Bulldog bulldog1 = (Bulldog)ani1; //2.때문에 런타임에러뜸
        //ani1 = new Animal();
        Dog dog1 = (Dog)ani1; //수동으로 형변환 해줘야한다.
        dog1.crying();
        dog1.jump();

    }
}
