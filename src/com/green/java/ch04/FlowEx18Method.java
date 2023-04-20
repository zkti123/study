package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println("-------------------");

        gugudan(2, 8);
        System.out.println("========================");
        gugudan(5, 7);

    }
    public static void gugudan(int sDan, int eDan){
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

