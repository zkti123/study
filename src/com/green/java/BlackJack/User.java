package com.green.java.BlackJack;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private List<Card> cardList;

    public User(){
        cardList = new ArrayList<>();
    }

    public void receiveCard(Card c){
        cardList.add(c);
//외부에서 카드 주소값을 받게 되면 Card c 가 저장 할 수 있어야된다.
    }

    public List<Card> openCards(){
        return cardList;
    }

}
