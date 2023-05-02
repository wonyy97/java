package com.green.java.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.openCard();
    }

    public static final String[] PATTERNS = {"♠", "♣", "♥", "♦"};
    public static final int CARD_COUNT = 13;

    private List<Card> cardList;

    public CardDeck() {
        this.cardList = new ArrayList();
        for (String pattern : PATTERNS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                this.cardList.add(new Card(pattern, getDenomination(i)));
            }
        }
    }

    private String getDenomination(int num) {
        switch (num) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(num);
        }
    }

//        for (int i = 0; i < PATTERNS.length; i++) {
//            for (int j = 1; j <= CARD_COUNT; j++) {
//                String str;
//                switch (j) {
//                    case 1:
//                        str = "A";
//                        break;
//                    case 11:
//                        str = "J";
//                        break;
//                    case 12:
//                        str = "Q";
//                        break;
//                    case 13:
//                        str = "K";
//                        break;
//                    default:
//                        str = String.valueOf(j);
//                }
//                cardList.add(new Card(PATTERNS[i], str));
//
//            }
//        }



    void openCard() {
        for (Card c : cardList) {
            System.out.println(c.getPattern() + c.getDenomination());

        }
    }
}
