package com.green.java.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc"); // new String으로 만들어진건 주소값이 달라진다.
        String s3 = new String("abc");
        System.out.printf("\"abc\" == \"abc\" ? %b\n", "abc" == "abc");   //주소값이 같은지 물어보는 ==   /★문자열은 무조건 equals★
        System.out.printf("s1 == s2 ? %b\n", s1 == s2);
        System.out.printf("s2 == s3 ? %b\n", s2 == s3);
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));

        String s4 = new String("aBc");
        System.out.println("s1.equals(s4) : " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));


    }
}
