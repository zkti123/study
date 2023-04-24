package com.green.java.sty;

public class classsty {
    /*                              클래스

    객체를 만드는 설계도
    어떤 객체를 표현하는 데이터와 객체의 행동을 나타내는 메소드로 구성.
    인스턴스(instance): 클래스가 생성하는 객체들.
    속석(attribute): 각 객체마다 갖는 특성.
    메소드(method): 모든 객체가 공유하는 행동.
    파일에 클래스가 한 개 있는 경우 -> 클래스명과 파일명이 일치해야 함.
    하나의 파일에 클래스가 여러 개 있는 경우, 단 한개의 클래스에만 public 키워드가 붙음
    (모든 클랠스에 public 키워드가 없을 수도 있음.)
    *
    예) 자동차 클래스 - 속성(변수) : 차종,색상,연식등등
                    -  메소드 : 공통된 행동(달리기,속도 올리기 줄이기,멈추기등등)
    * */
    /*                                  객체 생성

    객체를 생성하려면 new키워드 를 사용
    new키워드를 이용하면 메모리에 인스턴스의 속성을 저장할 수 있는 공간이 확보.
    인스턴스 참조변수 도는 레퍼런스 변수 : 인스턴스를 가리키는 변수

                    클래스명 객체명 = new 클래스명();

    * */
    /*                                  생성자

    인스턴스가 생성되는 순간에 자동으로 호출되는 특별한 메소드
    인스턴의 멤버 변수를 초기화하는 역할.
      특징
      1.생성자명은 클래스명과 같아야 한다.
      2.생성자는 인스턴스가 생성(new)될 때 자동으로 호출되는 특별한 메소드입니다.(단 1번만 호출)
      3.생성자는 반환값이 없는 메소드입니다.
      4.생성자는 얼마든지 오버로딩하여 사용할 수 있습니다.
    *디폴트 생성자
    new 키워드를 이용하여 인스턴스를 생성시, 생성자가 호출.
    클래스에 생성자가 없다면 new할 ㄸ 디폴트 생성자가 자동으로 호출.
    디폴트 생성자는 이름이 클래스 명과 똑같고 매개변수가 없음.

   *                                생성자 오버로딩
      메소드 오버로딩과 같이 생성자가 여러 개 있는것.
      클래스에 생성자를 넣을 때 주의할 점: 만약에 클래스에 디폴트 생성자가 아닌 생성자가
      하나라도 있다면 디폴트 생성자를 자동으로 제공하지 않는다.
    * */

  /*                                인스턴스 변수
  각 인스턴스마다 갖는 자신만의 데이터 영역.
  인스턴스 변수는 자동 초기화: boolean은 false로 초기화되고,byte,short,int,long 타입은
  0으로, float,double은 0.0으로 초기화, String은 null 값으로 초기화.
  인스턴스 변수 .(점연산자)을 이용하여 클래스 밖에서도 사용 가능
    * */
/*                                  클래스 변수

   static 키워가 붙는 변수를 '클래스 변수' 또는 '정적 변수'라고 한다.
   static 변수는 모든 인스턴스 가 공유하는 클래스당 한 개만 생성되는 변수.
   static 변수도 자동으로 초기화.
* */
/*                                  this 키워드

   this
   this는 현재 객체(인스턴스) 자신을 가리키는 변수.
   this.xx 는 객체 자신의 멤버를 가리킬때 사용.
   목적: 인스턴스 변수와 매개변수를 구분하기 위해 사용.

   this()
   this키워드는 어떤 생성자가 오버로딩도니 다른 생성자를 호출할 때 사용.
   반드시 생성자 첫 줄에 한 번만 써야 함.
   같은 클래스에 있는 메소드를 호출한다
예)==> void hello(){
    System.out.println("Hello");
    }
     void printFriend(){
        this hello();
    }
    this는 반드시 첫줄에 넣는다

* */
    /*                          static 키워드
    static 변수
    static 변수는 하나의 클래스에서 한 개만 만들어지는 변수.
    '클래스. static 변수명 ' 으로 사용
    static 메소드
    클래스 메소드 또는 정적 메소드라 부름.
    static 메소드를 호출할 때에는 '클래스.메소드명()'을 이용.
    static 키워드는 인스턴스 변수와 메소드 앞에 붙일 수 있음.
    static이 붙은 변수는 '클래스 변수'.

   !!!! static 메소드는 static으로 선언된 메소드와 변수만 사용가능.!!!!
   static은 static만 부른다!!
    * */
    /*                    자바의 접근제어와   private 키워드
    클래스 내의 멤버에 대해서 네 가지의 접근 권한: 인스턴스 변수, 생성자 또는 메소드,
    class 앞에 붙임.
    private : 같은 클래스 내에서만 접근이 가능함.
    protected : 상속과 관계가 있다.
    (default) : 패키지와 관계가 있다.
    public :  어디서나 접근이 가능하다.

    캡슈화(encapsulation): 인스턴스 변수에 private 접근 제어를 하는 것은 인스턴스 변수를
    보호하려는 의도.

   디폴트 접근 제어 (Default)
    private, protected, public 키워드가 아무 것도 붙지 않을 때.
    같은 패키지에서 접근 가능한 접근 제어.
    * */


}
