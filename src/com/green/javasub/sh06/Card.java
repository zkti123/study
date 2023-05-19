package com.green.javasub.sh06;

public class Card {


    private String kind; // 무늬
    private String num; //번호
    //this <== 나 자신의 객체 주소값이 저장됨 상수.
//    public Card(String kind){
//        this(kind, "A"); //this() <== 나 자신의 생성자 호출.
//    }

    public Card(String kind, String num){
        this.kind = kind;
        this.num = num;
    }

    public String getKind(){
        return kind;
    }

    public String getNum(){
        return num;
    }

    @Override
    public String toString() {
//        return "Card{" + kind  +", " + num  +'}';
        String superTostring = super.toString();
        return String.format("Card {%s, %s}",kind,num);
    }


}
