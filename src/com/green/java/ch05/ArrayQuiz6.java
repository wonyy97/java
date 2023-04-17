package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    copyArr에 numArr을 deep copy 해주세요
 */

public class ArrayQuiz6 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }
    }
}

