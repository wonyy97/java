package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name =  scan.nextLine();

        System.out.print("나이 입력: ");
        String input = scan.nextLine();

        int age = Integer.parseInt(input);
        System.out.printf("나의 이름은 %s이고, 나이는 %d살 입니다." ,name ,age);

        //나의 이름은 000이고, 나이는 00살 입니다.

        /*
        String name = "김원희";
        int age =0;
        System.out.print("나이 입력: ");
        String strAge = scan.nextLine(strAge);
        System.out.printf("나의 이름은 %s이고, 나이는 %d살 입니다." ,name ,age -1);
         */
    }
}
