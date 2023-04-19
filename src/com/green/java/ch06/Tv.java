package com.green.java.ch06;

public class Tv {

        String color;
        boolean power;
        int channel;

        void power() {power = !power;}  //플래그, 스위치
        void channelUp() {++channel;}
        void channelDown() {--channel;}



}
