package com.green.java.ch04;


import java.util.Scanner;

public class FlowEx주민번호 {
    public static void main(String[] args) {
        System.out.println("주민등록번호를 입력하십시오. ex)971111-2000000");

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        char gender = num.charAt(7);


        switch (gender) {
            case '2':
                System.out.println("2000년 이전 출생 여자");
                break;
            case '4':
                System.out.println("2000년 이후 출생 여자");
                break;
            case '1':
                System.out.println("2000년 이전 출생 남자");
                break;
            case '3':
                System.out.println("2000년 이후 출생 남자");
                break;
            default:
                System.out.println("잘못된 숫자입니다. 다시 입력해 주세요.");

        }
    }

}



