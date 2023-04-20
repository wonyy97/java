package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. (예:12345) > ");
        String temp = scan.nextLine();
        int sum = sumStringNumber(temp); // int메소드
        System.out.printf("각 자리수의 합 : %d\n", sum);
    }


    public static int sumStringNumber(String str) {
        int val = Integer.parseInt(str);
            int sum = 0;
            while (val > 0) {
                sum += val % 10; //나머지 구하기
                val /= 10;  //몫 구하기
            }
        return sum;
    }
}


//    public static int sumStringNumber(String val) {
//        int num;
//        int sum = 0;
//        num = Integer.parseInt(val);
//
//            while (num != 0) {
//                sum += num % 10;
//                num /= 10;
//            }
//        return sum;
//    }













    /*int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예:12345) > ");

                Scanner scan = new Scanner(System.in);
                String tmp = scan.nextLine();
                num = Integer.parseInt(tmp);

                while (num!=0) {
                sum += num % 10; //%(모드)가 나머지를 구하는 것이기 때문에!
                System.out.printf("sum=%3d num=%d\n", sum ,num);

                num /= 10;
                }

                System.out.println("각 자리수의 합:"+sum);*/