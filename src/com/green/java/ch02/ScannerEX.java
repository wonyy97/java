package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //Scanner Alt+Enter(import)하고 사용
        //스캐너타입에서 변경가능한건 이름(scan)밖에 없다 나머지는 그대로 적어야함

        System.out.print("두자리 정수를 하나 입력해주세요.");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);  //문자열 숫자를 정수형으로 뱉어냄

        System.out.println("입력내용 : "+ input +1);
        System.out.printf("num=%d\n", num +1);

    }
}

