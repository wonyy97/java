package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte), float(4byte) 실수     double이 더 정확하기때문에 더 선호함
        float f1 = 10; //자동형변환이 이루어지고 있음
        System.out.println(f1);

        f1 = (float)9.77;
        f1 = 9.77F; //모든 실수는 double타입으로 지정됨  float타입으로 지정해줘야 한다.
        f1 = 9.77f;
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1; //자동형변환 float 4byte / long 8byte
        System.out.println(f2);

        double d1 = 9.77d;
    }
}


// primitive type (원시타입, 기본타입) 리터럴값 저장
//정수형 : byte, short, int, long
//실수형 : double, float
//문자형 : char
//불린형 : boolean

//나머지는 대문자로 시작하는 regerence type (참조타입) 객체의 주소값 저장

