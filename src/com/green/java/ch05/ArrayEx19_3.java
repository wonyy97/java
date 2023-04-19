package com.green.java.ch05;
public class ArrayEx19_3 {
    /*
    번호  국어  영어  수학  총점  평균
    ==============================
    1   100    90    80  270   90.0
    2    20    20    20   60   20.0
    ...
    ==============================
    총점
    국어: 190
    영어: 180
    수학: 170

     */
    public static void main(String[] args) {
        String[] titles = { "국어", "영어", "수학"};
        int[] titleSumArr = new int[titles.length];
        int[][] score = {
                {100, 90, 80}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        System.out.print("번호\t");
        for(int i = 0; i < titles.length; i++) {
            System.out.printf("%s\t", titles[i]);
        }

        System.out.println("총점\t 평균");
        System.out.println("===============================");
        for (int i = 0; i < score.length; i++) {
            int[] eachscore = score[i];
            int sum = 0;
            System.out.printf("%d\t",i+1);
            for (int j = 0; j < eachscore.length; j++) {
                int jumsu = eachscore[j];
                //int jumsu = score[i][j];
                System.out.printf("%3d\t", jumsu);
                sum += jumsu;
                titleSumArr[j] += jumsu;
            }
            System.out.printf("%3d\t%4.1f\n", sum, ((double)sum / eachscore.length));
        }
        System.out.println("=================================");
        System.out.println("총점");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%s: %d\n", titles[i], titleSumArr[i]);
        }
    }
}