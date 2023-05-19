package com.green.javasub.sh06;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    static final String[] KINDS = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
    static final int NUM_MAX = 13;

    private List<Card> cardList;


    public CardDeck() {
        cardList = new ArrayList<>();
        //무늬 : spade, heart, club, diamond
        //번호 A, 2~10 , J,Q,K
        for (String kind : KINDS) {
            for (int i = 1; i <= NUM_MAX; i++) {
                String num = getKind(i);
                cardList.add(new Card(kind, num));
            }
        }
    }

    private String getKind(int n) {
        switch (n) {
            case 1:  return "A";
            case 11: return "j";
            case 12: return "Q";
            case 13: return "K";
        }
        return String.valueOf(n);
    }

    public void printAllCard() {
        for (Card c : cardList) {
            System.out.println(c);
        }
    }

    public Card pick() {
        int rIdx = (int)(Math.random()*cardList.size());
       return cardList.remove(rIdx); //remove 사용한 카드 삭제 및 사용한거 리턴


    }
}
























