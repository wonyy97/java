package com.green.java.ch04;

public class IfStuydy1 {
    public static void main(String[] args) {
//        if(조건식(무조건 boolean)) {
//    }
        int num = 9;
        if (num == 10) {
            System.out.println("num은 10입니다.");
        } else {
            System.out.println("num은 10이 아니다.");
        }
        int num2 = 4;
        if (num2 >= 20) {
            System.out.println("num2은 20이상");    //if는 한번만 가능
        } else if (num2 >= 10) {                   //else if는 무한대로 작성 가능
            System.out.println("num2은 10이상");
        } else if (num2 >= 5) {
            System.out.println("num2은 5이상");
        } else {                                   //else 한번만 가능
            System.out.println("num2는 5미만");     //else는 옵션 넣어도 되고 안넣어도 됨 하지만 없는 값는 출력되지 않음
        }
    }
}