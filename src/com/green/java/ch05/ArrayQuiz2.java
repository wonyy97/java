package com.green.java.ch05;
    /*rNumArr은 6칸 가지고 있는 정수형 배열입니다.
     각 칸에 랜덤한 숫자 1~45사이의 값을
    모든칸에 넣어주세요*/

import java.util.Scanner;

public class ArrayQuiz2 {
    public static void main(String[] args) {
        // 입력과 출력을 합치면 안된다.

        int[] rNumArr = new int[6];


        for (int i = 0; i < rNumArr.length; i++) {
            rNumArr[i] = (int)(Math.random() * 45) + 1;
            }

        for (int i = 0; i < rNumArr.length; i++) {
          System.out.println(rNumArr[i]);
        }
    }
}



