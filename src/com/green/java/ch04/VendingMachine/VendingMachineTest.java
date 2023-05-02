package com.green.java.ch04.VendingMachine;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);

        vm.showMenus();


        vm.purchaseDrink(1);
        vm.purchaseDrink(1);

        vm.showPurchaseList();
        vm.showMoney();
    }
}
