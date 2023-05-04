package com.green.java.BlackJack;

import com.green.java.ch07.cards.CardDeck;

public class Dealer extends User{

    private final int CAN_RECEIVE_POINT = 16;


    public boolean isReceiveCard() {
        return getPointSum() <= CAN_RECEIVE_POINT;
//        if (getPointSum() < CAN_RECEIVE_POINT){
//            return true;
//        }
//      return false;
    }
}
