package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    값 리터럴 적지 않는다.

 */

import java.util.Arrays;

public class ArrayQuiz10 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};

        int min = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if (min > numArr[i]) {      //max 는 <
                min = numArr[i];
            }
        }

        System.out.println("min: " + min);

    }
}



