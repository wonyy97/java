package com.green.java.ch05;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[5];

        for (int i = 0; i < numArr.length; i++) {     //int 디폴트값 = 0
            System.out.println(numArr[i]);
        }

        boolean[] boolArr = new boolean[4];     //boolean 디폴트값 = false
        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }

        String[] strArr = new String[3];   //대문자로 시작하는 이름은 디폴트값 = null
        for (int s = 0; s < strArr.length; s++) {
            System.out.println(strArr[s]);
        }

    }
}

