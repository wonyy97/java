package com.green.java.ch05;
//p.214
public class MultiArrayStudy1 {
    public static void main(String[] args) {
        //행  열
        int[][] temp = {
                {0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        System.out.printf("temp.length: %d\n");

        int[] arr0 = temp[0];
        arr0[0] = 30;
        System.out.printf("temp[0][0] > %d\n", temp[0][0]);



        int[][] score =  new int[4][3];

        System.out.println(score[0][0]);

        score[2][1] = 10;


        System.out.println(score.length); //줄값이 나옴
        System.out.println(score[0].length);
    }
}
