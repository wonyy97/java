package com.green.java.ch07;

public class MyTv extends Speaker {
    int channel;

    void channelUP() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

class MyTv2 {

    int channel;

    void channelUP() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    Speaker speaker;

    MyTv2() {
        speaker = new Speaker();
    }

    void volumeUP() {
        speaker.volumeUP();
    }

    void volumeDown() {
        speaker.volumeDown();
    }

    int getvolume() {
        return speaker.volume;
    }
}

class Speaker {
    int volume;

    void volumeUP() {
        volume++;
    }

    void volumeDown() {
        volume--;
    }
}