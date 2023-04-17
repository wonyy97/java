package com.green.java.ch04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자");
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i * 2 - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a; i > 0; i--) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i * 2 - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
