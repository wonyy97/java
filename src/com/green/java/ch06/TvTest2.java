package com.green.java.ch06;

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2(); //Tv2클래스 객체화 했다.

        for (int i = 0; i < 10; i++) {
            tv.channelUp();
        }
        System.out.printf("channel : %d\n", tv.channel);


        for (int i = 0; i < 10; i++) {
            tv.channelDown();
        }
        System.out.printf("channel : %d\n", tv.channel);
    }
}


class Tv2 {

    String color;
    boolean power;
    int channel;

    final int MAX_CHANNEL = 5; //final 한 번 입력된 값이 변하지 않는 것을 상수 라고 한다. only 대문자만 사용
    final int MIN_CHANNEL = 1;

    void power() {
        power = !power;
    }  //플래그, 스위치

    void channelUp() {
        if (channel < MAX_CHANNEL) {  //5 같이 지정되는것을 매직넘버라고 함
            ++channel;
        }
    }

    void channelDown() {
        if(channel > MIN_CHANNEL)
            --channel;
    }
}