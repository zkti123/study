package com.green.java.ch07.abstract2;

public interface Fightable {
    //인터페이스이름은 형용사로 주로 만든다.
    //인터페이스는 무조건 추상 메소드 만 적을 수있다.
    // 자동으로 앞에 public abstract 이 붙는다.
    //다중 상속이 가능하다.
    // 같은 클래스는 extends 클래스와 인터페이스 상속 implements 붙인다.
    void sum(int x, int y);

    void move(int x, int y);

}
