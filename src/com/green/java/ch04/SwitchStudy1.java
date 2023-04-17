package com.green.java.ch04;

public class SwitchStudy1 {
    public static void main(String[] args) {
        int level = 5;
        switch (level) {          //문자열 비교할 때 switch 이용한다. equals안써도 됨
            case 5:
                System.out.println("level은 5");
                break;
            case 4:
                System.out.println("level은 4");
                break;
            case 3:
                System.out.println("level은 3");
                break;
            case 2:
                System.out.println("level은 2");
                break;
            case 1:
                System.out.println("level은 1");
                break;
            default:
                System.out.println("level은 1~5가 아님");
        }
    }
}
