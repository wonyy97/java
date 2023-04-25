package com.green.java.ch07.cards;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("========================================");
        cd.shuffle();
        cd.openCards();
        System.out.println("========================================");

        for (int i = 0; i < cd.cards.length; i++) {
            cd.pick();
        }

        cd.pick();


        System.out.println("========================================");
        cd.openCards();

    }
}
