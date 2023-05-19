package com.green.javasub.sh06;

public class CardTest {
    public static void main(String[] args) {
//        Card c = new Card("SPADE ","A");
//        Card c2 = new Card("diamond ","10");
//
//        System.out.println(c); // Card {SPADE,A}
//        System.out.println(c2); // Card {diamond,10}
        CardDeck cd = new CardDeck();
        User u1 = new User();
        //cd.printAllCard();

        //랜덤한 카드객체 주소값 리턴,
        //리턴값 카드객체 주소값은  cardList에서 삭제 해주세요.
//        Card c1 = cd.pick();
//        System.out.println(c1);
//        System.out.println("=================");
//        cd.printAllCard();
        Card c1 = cd.pick();
        u1.receiveCard(c1);
        u1.receiveCard(cd.pick());

        //내가 가지고 있는 카드 점수
        //출력
        //점수 : 23
        u1.showTotalNum();

    }
}
