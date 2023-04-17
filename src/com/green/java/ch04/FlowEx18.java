package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {

        for(int i = 2; i < 19; i++) {
            for(int a = 1; a < 10; a++){
                System.out.printf("%d x %d = %d\n", i, a, i*a);
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
