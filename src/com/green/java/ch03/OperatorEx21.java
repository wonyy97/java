package com.green.java.ch03;

public class OperatorEx21 {
    public static void main(String[] args) {
        System.out.printf("10 == 10.f \t %b\n", 10 == 10.f);  //\t 띄워줌
        System.out.printf("'0' == 0 \t %b\n", '0' == 0);
                                            // 문자형 char == 정수형 int
        System.out.printf("'A' == 65 \t %b\n", 'A' == 65);
        System.out.printf("'A'+1 == 'B' \t %b\n", 'A'+1 == 'B');
        System.out.printf("'A'+1 != 'C' \t %b\n", 'A'+1 != 'C');    //!= 에서 !는 not의 의미를 가진다. 같지않지?
        //문자열 비교는 equals 사용
    }
}
