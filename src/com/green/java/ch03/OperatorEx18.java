package com.green.java.ch03;
//JDK 에 있는 API를 활용한 케이스
public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortpi = Math.round(pi * 1_000) / 1_000.0; //실수를 살리기위해서 .0을 데려옴
            //이미 있는기능을 불러왔다. 실수를 반올림 해준다.
        System.out.println(shortpi);

        System.out.println(Math.round(315.4));  //반올림  315
        System.out.println(Math.round(315.5));  //       316
        System.out.println(Math.ceil(315.1));   //올림    316.0 소수점 뒷자리에 값이 조금이라도 있으면 올려버림
        System.out.println(Math.floor(315.9));  //내림    315.0              값이 있든없든 내려버림
    }
}
