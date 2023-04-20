package com.green.java.ch04;


public class FlowEx13Method {
    public static void main(String[] args) {
        //최소 ~ 최대 사이의 값을 더하기
        //min값 ~ max값 sum: 값
        printAllSum(1,100);
    }

    //static 사용하면 바로 이름 호출 가능
    public static void printAllSum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.printf("min ~ max sum: %d", sum );
    }
}

