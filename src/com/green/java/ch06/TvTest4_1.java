package com.green.java.ch06;

public class TvTest4_1 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        Tv tv = new Tv();

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = tv;
            tvArr[i].channel = 10;

        }

        tvArr[0].channel = 1;

        System.out.println(tvArr[0].channel);
        System.out.println(tvArr[1].channel);
        System.out.println(tvArr[2].channel);
        System.out.println(tv.channel);


        String str = "dd";
        for(int i=0; i<tvArr.length; i++) {
            System.out.println(tvArr[i]);
        }
        System.out.println(tv);

    }
}


