package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;

public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv() {
        speaker = new HarmanSpeaker();
    }

    @Override
    public void turnOn() {
        System.out.println("삼성Tv 켜기");
        speaker.volumUp();
    }

    @Override
    public void turnOff() {
        System.out.println("삼성Tv 끄기");
        speaker.volumDown();
    }
}
