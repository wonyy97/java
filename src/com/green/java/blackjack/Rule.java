package com.green.java.blackjack;

import java.util.List;

public class Rule {

    public int getScore(List<Card> cardList) {
        int sum =0;
        for(Card c : cardList) {
            sum += getDenominationToNum(c);
        }
        return sum;
//        int result = 0;
//        for (int i = 0; i < cardList.size(); i++) {
//            String total = cardList.get(i).getDenomination();
//            switch (total) {
//                case "A": result += 1;
//                case "J": case "Q": case "K": result += 10;
//                default:
//                    result += Integer.valueOf(cardList.get(i).getDenomination());
//            }
//        }
//        return result;
    }

    private int getDenominationToNum(Card c) {
        switch (c.getDenomination()) {
            case "A" : return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }
}
