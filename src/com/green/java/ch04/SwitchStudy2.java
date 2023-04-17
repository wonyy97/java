package com.green.java.ch04;
//반복하기

import java.util.Scanner;

public class SwitchStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("점수 입력: ");
        int score = scan.nextInt();

        String grade = "D";
        switch (score / 10) {
            case 10: case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
        }
        System.out.printf("%d점의 학점은 %s입니다.", score, grade);
    }
}













    /*Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력 : ");
                int score = scan.nextInt();

                String grade = "D";
                switch (score / 10) {
                case 10:
                case 9:
                grade = "A";
                break;
                case 8:
                grade = "B";
                break;
                case 7:
                grade = "C";
                break;

                }
                System.out.printf("%d점의 학점은 %s 입니다.", score, grade);*/