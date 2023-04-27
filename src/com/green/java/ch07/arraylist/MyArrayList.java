package com.green.java.ch07.arraylist;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList {
    private int[] items;

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
    }

    public void add(int num) {
        int[] temp = new int[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }

        temp[items.length] = num;
        items = temp; //얕은복사
    }

    public void add(int idx, int value) {
        if (idx > items.length) {
            return;
        }

        int[] temp = new int[items.length + 1];
        temp[idx] = value;

        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }

        items = temp;
    }

    public int size() {
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }

    @Override
    public String toString() {
        String str = "[";
        if (items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        //return Array.toString(items);
        return str;
    }


    public void bubbleSort() {
//        int min = 0;
        for (int i = items.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                int sideIdx = z + 1;
                if (items[z] > items[sideIdx]) {
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                    System.out.println(Arrays.toString(items));
                }
            }
//        for (int i = 0; i < items.length-1; i++) {  // i가 items.length-1 (5-1 = 4) 작을동안 돌아간다.
//            for (int z = 0; z < items.length-i-1; z++) { // z가 items.length-i-1(4-0-1 = 3) 작을동안 돌아간다.
//                if (items[z] > items[z + 1]) { // z1보다 z0이 클 때 z0과 z1자리를 비교해서 바꿔준다.
//                    min = items[z];   // 임시변수 min을 이용해서 옮겨준다.
//                    items[z] = items[z + 1]; // 그리고 옮겨준 빈자리에 옆자리 z1를 넣어준다.
//                    items[z + 1] = min; // 그리고 옮겨진 z1자리에 min을 넣어준다.
//                    System.out.println(Arrays.toString(items));
//                }
//            }
        }
    }
}

