package com.green.java.ch07.cards;


public class Card {
    static final String[] KINDS = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
    static final int NUM_MAX = 13;


    String kind;
    String num;



    public Card() {
    }

    public Card(String kind, String num) {
        super();
        this.kind = kind;
        this.num = num;

    }


    @Override
    public String toString() {
        return "kind: " + kind + ", num: " + num;
    }
}
