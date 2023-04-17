package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예:12345) > ");

        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        num = Integer.parseInt(temp);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}















    /*int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예:12345) > ");

                Scanner scan = new Scanner(System.in);
                String tmp = scan.nextLine();
                num = Integer.parseInt(tmp);

                while (num!=0) {
                sum += num % 10; //%가 나머지를 구하는 것이기 때문에!
                System.out.printf("sum=%3d num=%d\n", sum ,num);

                num /= 10;
                }

                System.out.println("각 자리수의 합:"+sum);*/