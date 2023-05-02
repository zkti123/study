package com.green.java.ch04.VendingMachine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VendingMachineObj {
   private int money;
   private List<Drink> list = new ArrayList<>(); //상속관계

    public  VendingMachineObj(){
        list = new ArrayList<>();
        list.add(new Drink(1000,"콜라","코카콜라",500));
        list.add(new Drink(1500,"사이다","칠성",450));
        list.add(new Drink(1000,"환타","코카콜라",500));
    }

    public void insert(int i) {
        this.money += i;
        System.out.println(money);
    }

    public  void showMoney(){
        System.out.println("money : "+ money);
    }

    public void showMenus() {
        System.out.println("번호\t 메뉴명\t 가격\t 회사\t 용량");
        int num = 1;
        for (Drink d : list) {
            System.out.printf("%d. \t %s \t %,d원\t %s\t %d ml\n"
                    ,num++,d.getNm(),d.getPrice(),d.getCompany(),d.getMl());
        }


    }

    public void purchaseDrink(int num) {
        Drink d = list.get(num-1);
        System.out.printf("%s을(를) 구매하였습니다.\n",d.getNm());
        money -=d.getPrice();

    }
}

