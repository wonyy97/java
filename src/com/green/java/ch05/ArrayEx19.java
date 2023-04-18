package com.green.java.ch05;
public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 90, 80}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };

        int sum[] = new int[score.length];
        double avg[] = new double[score.length];
        int total[] =  new int[score[0].length];

        System.out.println("번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
        System.out.println("============================================");


        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                sum[i] += score[i][j];
            }
        }

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                avg[i] = sum[i] / score[0].length;
            }
        }


        for (int i = 0; i < score.length; i++) {

            System.out.printf("%d\t\t%3d\t\t%3d\t\t%3d\t\t%3d\t\t%.1f\n",
                    i + 1, score[i][0], score[i][1], score[i][2], sum[i], avg[i]);
        }


        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                total[j] += score[i][j];
            }
        }


        System.out.println("============================================");
        System.out.println("총점");
        System.out.println("국어: " + total[0]);
        System.out.println("영어: " + total[1]);
        System.out.println("수학: " + total[2]);
    }
}

