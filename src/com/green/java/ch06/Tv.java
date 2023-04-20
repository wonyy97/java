package com.green.java.ch06;

public class Tv {
                        //최초값

        String color;   //null
        boolean power;  // fulse
        int channel;  // 0

        void power() {power = !power;}  //플래그, 스위치
        void channelUp() {++channel;}
        void channelDown() {--channel;}



}
