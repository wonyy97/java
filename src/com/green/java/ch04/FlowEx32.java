package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("(1) squar");
            System.out.println("(2) squar root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료는 0)\n");
            //int menu = scan.nextInt();

            String temp = scan.nextLine();
            int menu = Integer.parseInt(temp);

            if (menu == 0) {
                System.out.println("종료합니다");
                break;
            } else if (menu <= 3 && menu >= 1) {
                System.out.printf("주문하신 메뉴는 %s입니다.\n", menu);

            } else {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
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