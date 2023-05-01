package com.green.java.ch05;

public class ArrayStudy4 {
    public static void main(String[] args) {
        int[] numArr = new int[]{10, 20, 30, 40, 50};
        int[] copyArr = numArr;
                                        //주소값은 항상 8byte
        numArr[0] =123;

        int[] arr = {1, 2, 3};
        printArr(arr);

        printArr(new int[] {1, 2, 3}); //만들자마자 초기화

        for (int i = 0; i < copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }
    }

    private static void printArr(int[] arr) {
    }
}
