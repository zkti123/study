package com.green.javasub.sh01;

public class Naming {
    public static void main(String[] args) {
        //단어가 1개라면 NAMING
        //단어가 2개라면 SUPER NAMING

        //카멜 케이스 기법(변수명, 메소드명)
        //naming 전부 소문자
        //superNaming 첫단어는 무조건 소문자 그다음 단어 첫문자는 대문자

        //파스칼 케이스 기법(클래스명)
        //Naming 첫번째만 대문자
        //SuperNaming 단어 첫문자 대문자

        //스네이크 케이스 기법 +전부대문자 단어사이에_넣기(상수명)

        //규칙
        //1. 대소문자 구분, 길이 제한 없음.
        // int aaa, aaA, aAa,Aaaa; 서로다름
        //2.예약어 사용 X
        // int int 안됨 int public안됨 X
        // 3.숫자로 시작하면 안됨
        // int 3aa; 안됨 두번째 자리 부터 가능

        //4. 특수기호는 _, $ 만 가능
        // int_12, $12, _aaaa, aaa_aa, fff$ff;


    }
}
