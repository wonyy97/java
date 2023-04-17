package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력: ");
        int num = scan.nextInt();
        System.out.println("num : " + num);

        // System.out.println(num + "은(는)" + (num % 2 == 0 ? "짝수" : "홀수"));


       /* int x = num % 2;
        String absX;
        absX = x == 0 ? "짝수" : "홀수";
        System.out.println(absX);
*/

        String result = num % 2 == 0 ? "짝수" : "홀수";
        System.out.printf("숫자 %d는 %s이다.", num, result);


     /*int x = num % 2;
        String absX;
        String a = "짝수";
        String b = "홀수";

        absX = x == 0 ? a : b;
        System.out.println(absX);*/


        //num값이 홀수면 "홀수"
        //num값이 짝수면 "짝수" 출력
    }
}

