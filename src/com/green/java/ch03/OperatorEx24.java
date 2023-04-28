package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        //   && and 연산자  뒤에 올 수 있는 것은 boolean type
        //   || or 연산자
        //  (2 > 1) && (3 > 2) 전부다 true 이여야지만 true이다
        //  (2 > 1) && (3 > 2) && (3 >= 5) = false
        //    true      true        false

        // (2 > 1) || (3 > 2) || (3 >= 5) or 연산자는 하나라도 true가 뜨면 true

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) && (3 >= 5);
        System.out.printf("r3 : %b\n", r3);
    }
}
    //and연산자는 false확률이 높은것이 앞에 있는게 좋다.
    // or연산자는 true 확률이 높은것이 앞에 있는게 좋다.
