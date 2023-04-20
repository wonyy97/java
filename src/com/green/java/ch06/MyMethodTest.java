package com.green.java.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10, 20);
        mm.sum(10, 22);
        mm.sum(10, 223);
        mm.sum(10, 245);
        mm.sum(20, 11);
        //int a = mm.sum(20, 11); X void는 =이 올 수 없다


        int result = mm.sum2(10, 245);
        System.out.println("result : " + result);

//        PrintSream ps = System.out;
//        ps.println("result : " + result);


    }

}
