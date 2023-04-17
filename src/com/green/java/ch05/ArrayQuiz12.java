package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    배열에 들어있는 평균값 구해주세요
    avg:
 */

import java.util.Arrays;

public class ArrayQuiz12 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35};
        int temp = 0;


        for (int i = 0; i < numArr.length; i++) {

            int a = (int) (Math.random() * numArr.length);

            temp = numArr[a];
            numArr[a] = numArr[i];
            numArr[i] = temp;


//            for (int j = 0; j < numArr.length; j++) {
//                int rIdx = (int) (Math.random() * numArr.length);
//                if (i == rIdx) { continue; }
//                temp = numArr[i];
//                numArr[i] = numArr[rIdx];
//                numArr[rIdx] = temp;
//            }


        }

        System.out.println(Arrays.toString(numArr));
    }
}



