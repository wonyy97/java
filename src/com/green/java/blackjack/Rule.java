package com.green.java.blackjack;

import java.util.List;

public class Rule {

    public static int getScore(List<Card> cardList) {
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

    private static int getDenominationToNum(Card c) {
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

    public static void whoIsWin(Gamer gamer, Dealer dealer) {
        int BLACK_SCORE = 21;
        int gPoint = gamer.getPointSum();
        int dPoint = dealer.getPointSum();
        if (gPoint <= BLACK_SCORE || (gPoint > dPoint || dPoint > BLACK_SCORE)){
            System.out.println("GAMER WIN");
        } else if (dPoint <= BLACK_SCORE && (dPoint > gPoint || gPoint > BLACK_SCORE)) {
            System.out.println("DEALER WIN");
        } else {
            System.out.println("DRAW");
        }
    }
}
