package com.green.java.ch06;

public class TvTest5 {

    static String brand;

    public static void main(String[] args) {
//        Integer.parseInt("11");
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        tv1.color = "black";
        tv2.color = "red";

        tv1.brand = "현대";
        tv2.brand = "기아";
        Tv.brand = "폭스바겐";

        TvTest5.brand = "볼보";

        System.out.println("tv1.color = " + tv1.color);
        System.out.println("tv2.color = " + tv2.color);

        System.out.println("tv1.color = " + tv1.brand);
        System.out.println("tv2.color = " + tv2.brand);
        System.out.println("Tv.color = " + Tv.brand); //이렇게 써야한다.
        System.out.println("TvTest5.color = " + TvTest5.brand);

    }
}