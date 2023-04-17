package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0;
        Scanner scan = new Scanner(System.in);

        Break : while (true) {
            System.out.println("1. 피자");
            System.out.println("2. 파스타");
            System.out.println("3. 족발");
            System.out.print("원하는 메뉴를 선택하세요. > ");

            String a = "피자";
            String b = "파스타";
            String c = "족발";

            String temp = scan.nextLine();
            menu = Integer.parseInt(temp);

            if (menu == 0) {
                System.out.println("종료");
                break;
            } else if (!(menu <= 3 && menu >= 1)) {
                System.out.println("다시골라");

            } else if (menu <= 3) {
                while (true) {
                    if (menu == 1) {
                        System.out.printf("%s 선택했습니다.\n주문해 주셔서 감사합니다.", a);

                    } else if (menu == 2) {
                        System.out.printf("%s 선택했습니다.\n주문해 주셔서 감사합니다.", b);

                    } else if (menu == 3) {
                        System.out.printf("%s 선택했습니다.\n주문해 주셔서 감사합니다.", c);
                    }break Break;
                }
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