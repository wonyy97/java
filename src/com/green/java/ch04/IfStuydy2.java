package com.green.java.ch04;

import java.util.Scanner;

public class IfStuydy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("점수 입력: ");
        int score = scan.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");    //if는 한번만 가능
        } else if (score >= 90) {                   //else if는 무한대로 작성 가능
            System.out.println("A");
        } else if (score >= 80) {                   //else if는 무한대로 작성 가능
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {                                   //else 한번만 가능
            System.out.println("D");     //else는 옵션 넣어도 되고 안넣어도 됨 하지만 없는 값는 출력되지 않음
        }

        System.out.println("Well Done!");
        //score값이 100초과면 "점수는 1~100점 사이입니다."
        //90 이상 "A"
        //80 이상 "B"
        //70 이상 "C"
        //나머지 "D"
    }
}