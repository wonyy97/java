package com.green.java.ch04;
//★ 반복작업 필수

import java.util.Scanner;

public class IfStuydy3 {
    public static void main(String[] args) {

        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);

        System.out.print("성별 입력 (w, m): ");
        String gender = scan.nextLine();

        System.out.print("키 입력(cm): ");
        int height = scan.nextInt();


        int stand = 0;

        if (gender.equals("w")) {
            stand = WOMAN_HEIGHT_STAND;
        } else if (gender.equals("m")) {
            stand = MAN_HEIGHT_STAND;
        }

        if (height > stand) {
            System.out.println("평균 초과");
        } else if (height < stand) {
            System.out.println("평균 미만");
        } else {
            System.out.println("평균");
        }

















        /*int stand = 0;

        if (gender.equals("w")) {
            stand = WOMAN_HEIGHT_STAND;
        } else if (gender.equals("m")) {
            stand = MAN_HEIGHT_STAND;
        }

        if (height < stand) {
            System.out.println("평균 미만");
        } else if (height > stand) {
            System.out.println("평균 초과");
        } else {
            System.out.println("평균");
        }*/



















       /* if (gender.equals("m"))
          if (height == MAN_HEIGHT_STAND) {
            System.out.println("평균입니다.");
        } else if (height > MAN_HEIGHT_STAND) {
            System.out.println("평균 초과 입니다.");
        } else if (height < MAN_HEIGHT_STAND)  {
            System.out.println("평균 미만 입니다.");
        }
        else if (gender.equals("w"))
            if(height == WOMAN_HEIGHT_STAND) {
            System.out.println("평균입니다.");
        } else if (height > WOMAN_HEIGHT_STAND)  {
            System.out.println("평균 초과 입니다.");
        } else if (height < WOMAN_HEIGHT_STAND)  {
            System.out.println("평균 미만 입니다.");
        }*/


        //m, 171 > 평균
        //m, 172 초과값 > 평균 초과
        //m, 170 이하값 > 평균 미만

        //w, 158 > 평균
        //w, 158 초과값 > 평균 초과
        //w, 158 이하값 > 평균 미만
    }
}