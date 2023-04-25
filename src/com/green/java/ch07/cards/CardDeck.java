package com.green.java.ch07.cards;


import static com.green.java.ch07.cards.Card.NUM_MAX;

public class CardDeck {
    Card[] cards;
    int idx;

    CardDeck() {
        cards = new Card[52];
        //        for (int i = 0; i < cards.length; i++) {
        //            cards[i] = new Card("","");
        //      }

        int idx = 0;

        for (int i = 0; i < Card.KINDS.length; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                //cards[i * NUM_MAX + z] = new Card("","");

                String num = null;
                switch (z) {
                    case 1:
                        num = "A";
                        break;
                    case 11:
                        num = "J";
                        break;
                    case 12:
                        num = "Q";
                        break;
                    case 13:
                        num = "K";
                        break;
                    default:
                        num = String.valueOf(z);
                }
                cards[idx++] = new Card(Card.KINDS[i], num);
            }
        }
    }


    void openCards() {

        for (Card c : cards) {
            System.out.println(c);
        }
    }

    void shuffle() {

        for (int i = 0; i < cards.length; i++) {
            int random = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }


    Card pick() {

        Card temp = cards[idx];
        cards[idx] = null;
        idx++;
        return temp;
    }
}