package com.green.java.ch06;

import java.io.PrintStream;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10, 20);  //void메소드
        mm.sum(10, 22);
        mm.sum(10, 223);
        mm.sum(10, 245);
        mm.sum(20, 11);
        //int a = mm.sum(20, 11); X void는 =이 올 수 없다


        int result = mm.sum2(10, 245);
        System.out.println("result : " + result);

        PrintStream ps = System.out; // ps는 PrintSream객체 주소값만 담을수 있다.
        ps.println("result : " + result);


    }

}
