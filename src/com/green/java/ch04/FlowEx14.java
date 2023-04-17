package com.green.java.ch04;

public class FlowEx14 {
    public static void main(String[] args) {

       for(int i=1, j=10; i<=10; i++, j--) {  //여기서 i 는 for문에서만 유효하다
           System.out.printf("%d \t %d\n", i, j);
       }

       int i = 0;      //i 다시 선언 가능
    }

}

        /*
        for(int i=1, j=10; i<=10; i++, j) {
            System.out.printf("%d \t %d\n", i, j--);
        } j-- 밑에서 증감 줘도 가능함*/
