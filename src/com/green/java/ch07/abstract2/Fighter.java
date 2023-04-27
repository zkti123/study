package com.green.java.ch07.abstract2;

public class Fighter implements Fightable{

    void jump(){
        System.out.println("파이터 점프");
    }


    @Override
    public void sum(int x, int y) {
        System.out.println("파이더 sum : "+(x+y));

    }

    @Override
    public void move(int x, int y) {
        System.out.printf("좌표 %d, %d로 이동\n",x,y);

    }
}

class Fighter2 implements Fightable{

    @Override
    public void sum(int x, int y) {

    }

    @Override
    public void move(int x, int y) {
        System.out.printf("좌표 %d, %d로 날아서 이동\n",x,y);
    }
}