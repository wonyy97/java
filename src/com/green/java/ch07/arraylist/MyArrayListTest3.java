package com.green.java.ch07.arraylist;

public class MyArrayListTest3 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 50);

        boolean r1 = list.contains(20);
        System.out.println(r1);

        boolean r2 = list.contains(30);
        System.out.println(r2);

        System.out.println(list);


    }
}
