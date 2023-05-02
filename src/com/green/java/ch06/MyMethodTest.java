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
//        System.out.println("result : " + result).; println이 리턴타입. 리턴받아오는게 레퍼런스타입이라서 . 사용가능

        PrintStream ps = System.out; // ps는 PrintSream객체 주소값만 담을수 있다.
        ps.println("result : " + result);


        String str = "   a_b_나_는_원_해_점심    ";
         String r1 = str.trim().replace("_","*").toUpperCase(); //체이닝 기법
        System.out.println(r1);



    }

}
