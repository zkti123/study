package com.green.java.BlackJack;

import java.util.List;

public class Rule {


    public static int getScore(List<Card> cardList) {
       int sum = 0;
        for (Card c : cardList) {
            sum += getDenominationToNum(c);
            System.out.println(c.getDenomination());
        }
        return sum;
    }

    private static int getDenominationToNum(Card c2){
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

    public static void whoIsWin(Gamer gamer, Dealer dealer) {
    int gPoint = gamer.getPointSum();
    int dPoint = dealer.getPointSum();

//    if (gPoint <= )

    }
}
