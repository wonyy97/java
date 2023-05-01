package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr1(lottoArr);
        System.out.println(Arrays.toString(lottoArr));


        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    public static void sortArr(int[] lottoArr) {
        for (int i = lottoArr.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                int idx = z + 1;
                if (lottoArr[z] > lottoArr[idx]) {
                    int temp = lottoArr[z];
                    lottoArr[z] = lottoArr[idx];
                    lottoArr[idx] = temp;

                }
            }
        }
    }

    public static int getRandomValuFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1)) + sVal;
    }

    public static void setRandomValuArr2(int[] lottoArr) {
        int i = 0;
        Loop:
        while (i < lottoArr.length) {
            int rVal = getRandomValuFromTo(1, 45);
            int z = 0;
            for (z = 0; z < i; z++) {
                if (lottoArr[z] == rVal) {
                    continue Loop;
                }
            }
            lottoArr[i++] = rVal;
        }
    }

    public static void setRandomValuArr1(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length; i++) {
            int rVal = getRandomValuFromTo(1, 45);

            for (int z = 0; z < lottoArr.length; z++) {
                if (lottoArr[z] == 0) {
                    lottoArr[z] = rVal;
                    break;

                } else if (lottoArr[z] == rVal) {
                    i--;
                    break;
                }

            }
        }
    }
}




