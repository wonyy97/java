package com.green.java.ch06;

public class VarargsTest {
    public static void main(String[] args) {
        sum(1);
        sum(1, 2);
        sum(1, 2, 3);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int[] arr = {1, 2, 3}; //배열을 보내줘도된다.
        sum(arr);
    }


    static void sum(int... nums) {  //가변인자
        int sum = 0;

//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }

        for (int val : nums) { //foreach문 써도 된다. 알아서 있는만큼 순서대로 넘겨준다.
            sum += val;            //length를 주지 않아도 된다.
        }

        System.out.printf("sum = %d\n", sum);
    }
}
