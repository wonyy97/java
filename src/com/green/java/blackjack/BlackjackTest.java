package com.green.java.blackjack;

import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if (dealer.isReceiveCard()) {
            dealer.receiveCard(cd.getCard());
        }

        gamer.showCards();

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Card More? (y / n) >");
            String temp = scan.nextLine().toLowerCase().trim();

            if("n".equals((temp.toLowerCase().trim()))) { break ;}
            gamer.receiveCard(cd.getCard());
            gamer.showCards();

//            if (temp.equals("y")) {
//                gamer.receiveCard(cd.getCard());
//            } else {
//                break;
//            }q
        }

        System.out.println("======   딜러 카드    =======");
        dealer.showCards();
        Rule.whoIsWin(gamer, dealer);
    }
}