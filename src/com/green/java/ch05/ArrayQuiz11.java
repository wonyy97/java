package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    배열에 들어있는 평균값 구해주세요
    avg:
 */

public class ArrayQuiz11 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] numArr = {11, 14, 2, 7, 36, 35, 10000};
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        double avg = (double) sum / numArr.length;


        System.out.printf("sum: %,d avg: %.2f\n",sum ,avg);
        //1000단위 , 넣고 싶을 때 %,d 하면 찍힌다
    }
}



