package com.green.java.ch04;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMoney();
    }
}
