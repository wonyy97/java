package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        //배열의 친구는 for문
        int n1=1, n2=2, n3=3;

        n1 = 2;

        int[] numArr = {10, 20, 30, 40}; //int형 배열
                    //   0   1   2   3
        int numArr2[] = {10, 20}; // 이렇게 만들면 맞는다

        numArr[0] = 11;  //int방이 여러개
        int num = numArr[1];
        System.out.println("num: " + num);

    }
}
