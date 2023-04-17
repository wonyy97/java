package com.green.java.ch04;


public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("카운트다운 시작");

        while (i-- != 0) {
            System.out.println(i);

            for(long z=0; z<2_000_000_000; z++) {
                int y =0;
            }
        }
        System.out.println("끝!");
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
