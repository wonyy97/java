package com.green.java.ch05;

//p.214
public class MultiArrayStudy3 {
    public static void main(String[] args) {
        //행  열
        int[][][] mArr = new int[4][3][2];

        mArr[0][0][0] = 10;
        mArr[0][0][1] = 11;
        mArr[0][1][0] = 12;
        mArr[0][1][1] = 13;
        mArr[3][2][1] = 100;
    }
}