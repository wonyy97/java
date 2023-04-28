package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        OperatorEx32Quiz1 opq1 = new OperatorEx32Quiz1();

        absX = opq1.getAbs(x);
        absY = opq1.getAbs(y);
        absZ = opq1.getAbs(z);

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);

    }

//    static int getAbs(int num) {
//        num = num >= 0 ? num : -num;
//        return num;
//    }

    public int getAbs(int n) {
        if(n>=0) {
            return n;
        }
        return -n;
    }
}