package com.green.java.ch04;

import java.util.Scanner;

/*(1)
(1) square
(2) square root
(3) log
원하는 메뉴(1~3)을 선택하세요 (종료: 0) >4
메뉴를 잘못 선택하셨습니다.(종료 : 0)
(1) square
(2) square root
(3) log
원하는 메뉴(1~3)을 선택하세요 (종료: 0) > 1
선택하신 메뉴는 1번입니다.
(1) square
(2) square root
(3) log
원하는 메뉴(1~3)을 선택하세요 (종료: 0) > 0
프로그램을 종료합니다.
 */
public class FlowEx32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){

            System.out.println("(1)squre");
            System.out.println("(2)squre root");
            System.out.println("(3)log");
            System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료: 0) >");
            String input = sc.nextLine();
            int num = Integer.parseInt(input);

            if(num== 0) {
                System.out.println("프로그램을 종료합니다.\n");
                break;
            }else if(num >0 && num <=3){
                System.out.printf("선택하신 메뉴는 %d번입니다.\n",num);
            }else{
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료: 0)");
            }
        }
    }
}
