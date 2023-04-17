package com.green.java.ch04;

public class FlowEx17 {
    public static void main(String[] args) {
        int star = 8;

        for(int i=1; i<=star; i++) {

            for (int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}