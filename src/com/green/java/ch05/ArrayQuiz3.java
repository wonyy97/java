package com.green.java.ch05;
/*
    numArr 배열을 이용하여 각 방의 짝수값만 콘솔에 출력해 주세요
 */

public class ArrayQuiz3 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                System.out.println(numArr[i]);
            }
        }
    }
}


