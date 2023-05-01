package com.green.java.ch05;

public class ArrayQuiz1 {
    public static void main(String[] args) {
        int[] numArr = {0, 0, 0, 0, 0, 0};

        //for(값 입력 1,2,3)
        //for(값 출력, 각 방에 있는 값을 출력)
        //0 > 1
        //1 > 2
        //2 > 3


        //0부터 시작하고 length만큼 돈다
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i + 1;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + " > " + numArr[i]);
        }

    }
}
