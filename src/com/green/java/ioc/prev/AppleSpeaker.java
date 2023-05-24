package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker() {
        woofer = new BoWoofer();
    }

    @Override
    public void volumUp() {
        System.out.println("애플 Speaker 소리 올림");
        woofer.sound();
    }

    @Override
    public void volumDown() {
        System.out.println("애플 Speaker 소리 내림");
        woofer.sound();
    }
}
