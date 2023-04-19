package com.green.java.ch06;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Time t1 = new Time(); //Time 객체 하나당 멤버필드 갯수 만큼 저장가능
                                //hour 1~23



        System.out.print("시간을 입력하시오. ");
        int hour = scan.nextInt();
        System.out.println("hour: " + t1.getHour());

        t1.setHour(10);
        System.out.println("hour: " + t1.getHour());

    }
}
