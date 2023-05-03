package com.green.java.blackjack;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();


//        Card c = cd.getCard();
//        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        int gamerScore = rule.getScore(gamer.openCards());
        int dealerScore = rule.getScore(dealer.openCards());
        System.out.println(gamerScore);
        System.out.println(dealerScore);



//        cd.showSize();

//        Card c = cd.getCard();
//        System.out.print(c.getPattern());
//        System.out.println(c.getDenomination());
//        cd.showSize();
//
//        Card c2 = cd.getCard();
//        System.out.print(c.getPattern());
//        System.out.println(c2.getDenomination());
//        cd.showSize();
    }
}
