package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] numArr = new int[]{10, 20, 30, 40, 50};
        int[] copyArr = numArr;      //얕은복사 : 주소값 복사
                                     //깊은복사 :
        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }
    }
}
