package com.green.java.ch05;
/*

 */

public class ArrayQuiz4 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println("sum: " + sum);
    }
}


