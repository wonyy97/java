package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        //10을 3으로 나눠서 소수점이 나타나도록 해주세요.
        //3.0이 나오지 않도록 해주세요.

        //double r = (double) n1/n2;
        //System.out.println(r);

        // double n3 = (double) n1;
        // double n4 = (double) n2;
        //System.out.println(n1/n2);

        System.out.println((double)n1 / n2);  //하나라도 double로 형변환시키면 자동 형변환이 되어진다.

        double r = (double) n1/n2;
        System.out.printf("값은 %.5f입니다.",r);

    }
}
