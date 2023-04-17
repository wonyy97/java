package com.green.java.ch02;

public class Naming {

    //p.25~26
    public static void main(String[] agrs) {
        //단어 + 단어 + 단어

        // Hello World Bye

        //기법
        //★파스칼 케이스 기법 > 클래스명
        String HelloWorldBye;

        //★카멜 케이스 기법 > 변수명, 메소드명
        String helloWorldBye;

        //스네이크 케이스 기법
        String hello_world_bye;

        //케밥 케이스 기법
        //String hello-world-bye;

        //자바 이름에 쓸 수 있는 특수기호 2개 : _ , $
        String _h1, h$1;

        //이름 처음에 숫자 사용할 수 없다. but 처음만 아니면 상관없다
        //String 1aa; X
        //String a1a; ○

        //이름에 빈칸 사용할 수 없다
        //String hello World

        //대소문자 구분
        String aaa;
        String aaA;
        String aAa;

        //예약어 사용 금지 (파란색상 단어는 예약어)
        //예약어는 변수명으로 사용 금지
        //String public;
        String pUblic;

        //상수는 전부 대문자, 스네이크 케이스  상수 : 한번 값이 입력되면 수정 불가능. 속도가 빠르다. 실수하지 않기위해 사용한다.
        final int MY_NUM = 10;   //두 단어를 같이 쓸때는 언더바_를 쓴다.
        //NUM = 20;
    }
}
