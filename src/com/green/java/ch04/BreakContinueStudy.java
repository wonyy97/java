package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");

            if (i == 5) {
                System.out.println("\n5에서 끝!");
                break; //만나면 바로 빠져나온다.
            }
        }
        System.out.println("-----------------" +
                "" +
                "--------");

        for (int i = 0; i < 10; i++) {
            if(i==5) {
                continue;  // 바로 증감식 쪽으로 스킵된다
            }
            System.out.print(i + ", ");
        }
    }
}