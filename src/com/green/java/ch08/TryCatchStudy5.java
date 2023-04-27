package com.green.java.ch08;


public class TryCatchStudy5 {
    public static void main(String[] args) {

        try {
            getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        otherGetConnection2();

    }

    public static void getConnection() throws Exception {
        System.out.println("DB 연결!!");
    }

    public static void otherGetConnection() throws Exception {
        getConnection();
    }

    public static void otherGetConnection2() {
        try {
            getConnection();
        } catch (Exception e) {

        }
    }
}
