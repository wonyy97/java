package com.green.java.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {

    static int getRandomNumber2(int min, int max) {
        return (int) (Math.random() * max - min + 1) + min;
    }

    static int[] getRandomNumberArr(int numberCount) { //정수크기만큼
        int[] arr = new int[numberCount];           //배열을 만듦

        int selectedIdx = 0;
        Loop:
        while (selectedIdx < arr.length) {
            int rVal = getRandomNumber2(1, 9);

            for (int i = 0; i < selectedIdx; i++) {
                if (arr[i] == rVal) {
                    continue Loop;
                }
            }
            arr[selectedIdx++] = rVal;
        }
        return arr;
    }


    public static void main(String[] args) {

        final int NUMBER_COUNT = 3;
        int[] numArr = getRandomNumberArr(NUMBER_COUNT);
        System.out.println(Arrays.toString(numArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("[GAME START]");

        int count = 0;
        while (true) {
            count++;
            int[] myArr = new int[NUMBER_COUNT];

            for (int i = 0; i < NUMBER_COUNT; i++) {
                System.out.printf("%d번 숫자 입력: ", i + 1);
                myArr[i] = scan.nextInt();
            }

            int s = 0, b = 0, o = 0 ;

            for (int i = 0; i < NUMBER_COUNT; i++) {
                for (int z = 0; z < NUMBER_COUNT; z++) {
                    if (numArr[i] == myArr[z]) {
                        if (i == z) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            o = NUMBER_COUNT - (s + b);
            System.out.printf("S: %d, B: %d, O: %d\n", s, b, o);


            if (s == NUMBER_COUNT) {
                System.out.println("[GAME OVER!]");
                System.out.printf("도전 횟수 : %d", count);
                break;
            }

        }
    }
}




//초안
//for (int i = 0; i < NUMBER_COUNT; i++) {
//            for (int j = 0; j < NUMBER_COUNT; j++) {
//                if (myArr[i] == numArr[j] && i == j) {
//                    S += 1;
//                } else if (myArr[i] == numArr[j] && i != j) {
//                    B += 1;
//                } else {
//                    O += 1;
//                }
//
//            }
//        }