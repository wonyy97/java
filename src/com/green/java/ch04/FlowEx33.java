package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i <= 9; i++) {
            for (int z = 1; z <= 9; z++) {
                if (z == 5) {
                    break Loop1; //continue도 된다.
                }
                System.out.printf("%d, %d\n", i, z);
            }
        }
    }
}








/*if (menu == 0) {

                if (menu == 1) {
                    System.out.printf("%s를 선택했습니다.\n주문해 주셔서 감사합니다.", a);
                } else if (menu == 2) {
                    System.out.printf("%s를 선택했습니다.\n주문해 주셔서 감사합니다.", b);
                } else if (menu == 3) {
                    System.out.printf("%s를 선택했습니다.\n주문해 주셔서 감사합니다.", c);
                    break;

                } else {
                    System.out.println("다시 선택해 주세요.");
                }*/





       /* switch (menu) {
        case 1:
        System.out.println("선택하신 메뉴는 1번입니다.");
        break;
        case 2:
        System.out.println("선택하신 메뉴는 2번입니다.");
        break;
        case 3:
        System.out.println("선택하신 메뉴는 3번입니다.");
        break;*/