package com.green.java.ch03;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        absX = x >= 0 ? x : -x; //3항연산자
             // boolean
           // 값이 참이면 2번째 값
           // 값이 거짓이면 3번째 값
          //x 값을 바꿀려면 =(대입연산자)가 필요하다
        System.out.println(absX);

        absY = y >= 0 ? y : -y;
        System.out.println(absY);

        absZ = z >= 0 ? z : -z;
        System.out.println(absZ);
    }
}

// if문 (분기문)