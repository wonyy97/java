package com.green.java.ch05;

public class ArrayEx18 {
    public static void main(String[] args) {
        int [][] score = {
                {100,100,100}
                ,{20,20,20}
                ,{30,30,30}
                ,{40,40,40}
        };
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                System.out.printf("score[%d][%d] = %d\n", i, j, score[i][j]);
            }
        }

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                sum += score[i][j];
            }
        }

        System.out.println("sum="+sum);
    }
}














