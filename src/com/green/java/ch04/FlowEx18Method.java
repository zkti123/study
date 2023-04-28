package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println("-------------------");

        gugudan(2, 8);//파란색: 파라미터
        // 메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 한다.
        // 주의할 점은 '리턴 값만' 다른 것은 오버로딩을 할 수 없다.
        System.out.println("========================");
        gugudan(5, 7);//아규먼츠값

    }
    public static void gugudan(int sDan, int eDan){//인자,파라미터,매개변수
        for (int i = sDan; i <= eDan; i++) {
          gugudan(i);

            }
        }




        public static void gugudan(int gugudan){

            for(int i = 1; i<=9; i++){
                    System.out.printf("%d X %d = %d\n", gugudan, i, (gugudan *i));

                }   System.out.println();

        }


}

