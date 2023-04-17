package com.green.java.ch04;

public class FlowEx21 {
    public static void main(String[] args) {
        for(int i=1; i<=3;i++) {
            for(int a =1; a<=3; a++) {
                if (i==a) {
                    System.out.printf("[%d,%d]", i, a);
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }
    }
}



























/*
for (int i = 2; i < 10; i++) {

        for (int a = 1; a < 10 ; a++) {
        System.out.printf("%d x %d = %d\n", i, a, i*a);
        }
        System.out.println();
        }
*/
