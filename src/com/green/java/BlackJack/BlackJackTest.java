package com.green.java.BlackJack;

import java.util.Scanner;

public class BlackJackTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Rule rule = new Rule(); //Rule Static 붙어있기 때문에 객채화 필요없음.
        Dealer dealer = new Dealer();


        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }
        if (dealer.isReceiveCard()){
            dealer.receiveCard(cd.getCard());
        }
        gamer.showCard();




        while (true){
            System.out.println("Card More? (y/n) >");
            String answer = scan.nextLine();

            if ("n".equals(answer.trim().toLowerCase())){break;}
            gamer.receiveCard(cd.getCard());
            gamer.showCard();
        }
        System.out.println("=====딜러 카드======");
        dealer.showCard();

        Rule.whoIsWin(gamer,dealer);


//        Card c1 = cd.getCard();
//        System.out.println(c1);
//        System.out.println("===================");
//

//        gamer.receiveCard(cd.getCard());
//        gamer.receiveCard(cd.getCard());
//
//        dealer.receiveCard(cd.getCard());
//        dealer.receiveCard(cd.getCard());

//        if (dealer.isReceiveCard()){
//            dealer.receiveCard(cd.getCard());
//        }

//        int gamerscore = rule.getScore(gamer.openCards());
//        int dealerscore = rule.getScore(dealer.openCards());
//
//        System.out.println("gamerscore : "+gamerscore);
//        System.out.println("dealerscore : "+dealerscore);


    }
}
