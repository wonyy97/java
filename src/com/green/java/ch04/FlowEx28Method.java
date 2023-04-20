package com.green.java.ch04;

import java.util.Random;
import java.util.Scanner;

public class FlowEx28Method {

    public static int getRandomNumber(int n1, int n2) {

        int answer = (int)(Math.random()*(n2-n1+1))+n1;

        return answer;
    }




    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = getRandomNumber(1, 10);
        System.out.println(answer);
        do {
            System.out.print("1 ~ 100사이의 정수를 입력: ");
            input = scan.nextInt();

            if (input > answer) {
                System.out.println("▼DOWN\n");
            } else if (input < answer) {
                System.out.println("▲UP\n");
            }

        } while (input != answer);

        System.out.println("★축 정답★");
    }


}

