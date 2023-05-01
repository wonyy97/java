package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz7 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};
        int[] copyArr = new int[numArr.length + 1];

        copyArr[numArr.length] = 100;
//        copyArr[copyArr.length-1] = 100;
//        copyArr[6] = 100;


        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }

        String result = Arrays.toString(copyArr);
            System.out.println(result);

    }
}

