package com.green.java.ch08;

public class TryCatchStudy2 {
    public static void main(String[] args) {
        String str = "123a";
        try {
            int r1 = 10 / 0;
            int num = Integer.parseInt(str);
            System.out.println("num : " + num);
        } catch (ArithmeticException e) {
            System.out.println("숫자 예외 발생");
        } catch (NumberFormatException e) {
            System.out.println("넘버포맷 예외 발생");
        } catch (Exception e) { //Exception 캐치문은 제일 하단에 있어야한다.
                                // 모든 예외를 포함하기 때문에 상단에 있어버리면 이 캐치문이 다 잡아버린다.
            e.printStackTrace();
            System.out.println("예외발생");
        } finally {
            System.out.println("finally");
        }
        System.out.println("끝!!!");
    }
}
