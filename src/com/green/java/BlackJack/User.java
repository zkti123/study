package com.green.java.BlackJack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private List<Card> cardList;

    public User() {
        cardList = new ArrayList<>();
    }

    public void receiveCard(Card g) {
        cardList.add(g);
//외부에서 카드 주소값을 받게 되면 Card c 가 저장 할 수 있어야된다.
    }

    public List<Card> openCards() {
        return cardList;
    }


    protected int getPointSum() {
       return Rule.getScore(cardList);
    }

    private int getDenominationToNum(Card c2) {
        switch (c2.getDenomination()) {
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 10;
            default:
                return Integer.parseInt(c2.getDenomination());
        }

    }
    public void showCard(){
        System.out.println("[현재 카드 보유 목록]");
        for (Card c : cardList) {
            System.out.println(c);
        }
        /*
        [현재 카드 보유 목록]
        Card{♠,10}
        Card{♠,5}
         */

    }

}
