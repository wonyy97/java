package com.green.java.ch05;
import java.util.Arrays;

public class ArrayQuiz8 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};

        System.out.print("[");

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("%d",numArr[i]);
            if (i < numArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("-------------------------------");

        System.out.printf("[%d", numArr[0]);
        for (int i = 1; i < numArr.length; i++) {
            System.out.printf(", %d", numArr[i]);
        }
        System.out.println("]");
    }
}

