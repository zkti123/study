package com.green.java.BlackJack;

public class Card {
    private String pattern; //무늬
    private String denomination; //점수

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString(){

        return String.format("Card{%s, %s}",this.pattern,this.denomination);
        //String.format
    }

}
