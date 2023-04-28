package com.green.java.ch04;

public class VendingMachine {
    private int money;

    public void insert (int money) {
        this.money += money;

    }

    public void showMoney() {
        System.out.printf("현재 잔액은 %,d원 입니다.\n", this.money);
    }
}
