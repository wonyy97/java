package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    값 리터럴 적지 않는다.


 */

import java.util.Arrays;

public class ArrayQuiz9 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};

        int temp = numArr[1];
        numArr[1] = numArr[0];
        numArr[0] = temp;

        System.out.println(Arrays.toString(numArr));

    }
}



