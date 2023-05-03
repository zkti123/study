package com.green.java.BlackJack;

import java.util.List;

public class Rule {

    public int getScore(List<Card> cardList) {
       int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
            System.out.println(c.getDenomination());
        }
        return sum;
    }

    private int getDenominationToNum(Card c2){
        switch (c2.getDenomination()){
            case "A" : return 1;
            case "J" :
            case "Q" :
            case "K" :
                return 10;
            default:
                return Integer.parseInt(c2.getDenomination());
        }

    }

}
