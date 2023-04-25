package com.green.java.ch07.cards;


public class CardDeck {
    Card[] cards;
    int idx;

    CardDeck() { //기본생성자
        cards = new Card[52];
        //        for (int i = 0; i < cards.length; i++) {
        //            cards[i] = new Card("","");
        //      }

        int idx = 0;
                        //()가 없으니 멤버필드, 클래스명. 으로 시작하면 static이다. 대문자로만 이루어져있으니 상수, .length를 보면 배열이란것을 알수있다.
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
                        num = String.valueOf(z);//정수형 숫자를 문자열로 바꿔준다.
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
            if(i == random) { continue; } //값이 너무 클 경우 ex) 0~50000 에는 빼줘도 된다. 값이 겹칠 확률이 적기 떄문에
            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }


    Card pick() {                                //0~51
        if(idx == cards.length) { return null; } //pick을 엄청 많이 호출했을 때 52번이 오면 null이 오도록 예외처리를 한것이다.
        Card temp = cards[idx];
        cards[idx] = null;
        idx++;
        return temp;
    }
}