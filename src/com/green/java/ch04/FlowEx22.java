package com.green.java.ch04;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;

        for(int i=0;i<arr.length;i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        for(int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }
}



























/*
for (int i = 2; i < 10; i++) {

        for (int a = 1; a < 10 ; a++) {
        System.out.printf("%d x %d = %d\n", i, a, i*a);
        }
        System.out.println();
        }
*/
