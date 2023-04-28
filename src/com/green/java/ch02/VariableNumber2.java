package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {
        //리터럴 Literal, 값 그 자체
        // -128 ~ 127 값이 넘칠때 다시 처음으로 돌아온다 (오버/언더 플로우)
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 129;
        int i2 = (int)b1; //자동형변환

        if (i1 < Byte.MAX_VALUE && i1 >= Byte.MIN_VALUE){
            b1 = (byte)i1;   //강제형변환  /오버플로우 조심  int값을 byte값으로 형변환이 되지 않기 떄문에 강제로 형변환 시킨다
        }
        System.out.println(b1);

        b1 = (byte)-129;   //강제형변환  /언더플로우 조심
        System.out.println(b1);

    }
}
