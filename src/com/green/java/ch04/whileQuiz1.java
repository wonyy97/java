package com.green.java.ch04;

import java.util.Scanner;

public class whileQuiz1 {
    public static void main(String[] args) {
        //while문으로해결
        //랜덤값 1~100사이의 랜덤값
        //1~100사이의 정수를 입력: 50
        //down
        //1~100사이의 정수를 입력: 25
        //up
        //1~100사이의 정수를 입력: 30
        //good!!
        // 조건식 내가 입력한 값과 랜덤값이 다르다면
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int) (Math.random() * 100) + 1; //0~4
        System.out.print("1~100사이의 정수를 입력: ");
        input = scan.nextInt();


        while (input != answer) {

            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }
            System.out.print("1~100사이의 정수를 입력: ");
            input = scan.nextInt();

        }

        System.out.println("good!!");

    }
}

