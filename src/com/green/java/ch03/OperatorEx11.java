package com.green.java.ch03;

public class OperatorEx11 {
    public static void main(String[] args) {
       char a = 'a';
       char d = 'd';
       char zero = '0';
       char two = '2';

        System.out.printf(" '%c' - '%c' = %d\n", d, a ,d - a);  // char - char 계산이 안되니까 정수형으로 자동형변환 됐음

        System.out.printf("%c - %d\n", zero, (int)zero);
        System.out.printf("%c - %d\n", two, (int)two);

    }
}
