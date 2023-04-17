package com.green.java.ch01;

    // single line comments (주석)
        /*
           multi line comments
         */
    /*
    jvm 메모리 정리
    jdk (API) 자바 개발 도구
    jre 자바를 구동할 때 필요한것 자바 실행 환경
       > jvm 이 항상 포함되어있다.
           >GC
    package는 독단적이여야 한다 부딪히지 않아야하기 때문에
    특별하게 하기 위해 com. 웹도메인을 쓴다.
    main에서 시작되기 때문에 매우 중요하다.
    소괄호 = 메소드
     */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("dd");   //print 계행을 해주지 않는다.
        System.out.println("Hello World!");   //println 계행 해줌
        System.out.println("안녕 세상!");
    }
}
