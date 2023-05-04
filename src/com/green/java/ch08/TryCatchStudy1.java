package com.green.java.ch08;

//p.416
public class TryCatchStudy1 {
    public static void main(String[] args) {
        try {
            //예외가 발생될 가능성이 있는 로직(source)위치
            int r1 = 10 / 0; //에러 발생되자마자 catch로 넘어가버림
            System.out.println("다음줄"); //이것은 실행안됨
        } catch (Exception e) { //e에는 예외와 관련된 모든게 저장되어있다.
            e.printStackTrace(); //예외가 어떤 내용인지 , 에러의 이유를 메세지로 보여준다.
            System.out.println("예외발생");
            //예외가 발생 되었을 때 하고싶은 작업(로직) 위치
        } finally {
            //옵션, 예외가 발생이 되든 안되든 무조건 실행하고 싶은 로직 위치
            //~~실행보장~~
            System.out.println("finally");
        }
        System.out.println("끝!");
    }
}
