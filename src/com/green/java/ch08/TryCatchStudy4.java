package com.green.java.ch08;


public class TryCatchStudy4 {
    public static void main(String[] args) {
        int type = 0;
        try {
            System.out.println("ddd");
            if (type == 0) {
                throw new Exception("고의로 예외 발생"); //throw는 예외를 내가 만드는것
            } else if (type == 1) {
                throw new ArithmeticException("dd"); //"메세지"
            }
        } catch (ArithmeticException e) {
        } catch (Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("끝!!");
    }
}
