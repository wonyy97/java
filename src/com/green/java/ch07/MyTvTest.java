package com.green.java.ch07;

public class MyTvTest {
    public static void main(String[] args) {
        MyTv mt = new MyTv();
        mt.volumeUP();
        mt.volumeUP();
        mt.volumeUP();

        System.out.println(mt.volume);

        MyTv2 mt2 = new MyTv2();
       // mt2.speaker = new Speaker();
        mt2.volumeUP();
        mt2.volumeUP();

        System.out.println(mt2.speaker.volume);

    }
}


