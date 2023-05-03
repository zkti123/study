package com.green.java.BlackJack;

public class BlackJackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        Dealer dealer = new Dealer();

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        int gamerscore = rule.getScore(gamer.openCards());
        int dealerscore = rule.getScore(dealer.openCards());

        System.out.println("gamerscore : "+gamerscore);
        System.out.println("dealerscore : "+dealerscore);


    }
}
