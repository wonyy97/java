package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer;

    public HarmanSpeaker() {
        woofer = new BoWoofer();
    }

    @Override
    public void volumUp() {
        System.out.println("하만 Speaker 소리 올림");
    }

    @Override
    public void volumDown() {
        System.out.println("하만 Speaker 소리 내림");
    }
}
