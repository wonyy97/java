package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;

        MyMathInstance mmi = new MyMathInstance();

        int sum = mmi.sum(n1, n2);  //static이 안붙은 애들은 무조건 객체화가 필요하다
        System.out.printf("%d + %d = %d\n", n1, n2, sum);
        //MyMathInstance 클래스에 있는 sum메소드
        // 이용해서 n1, n2값을 더한 결과를 콘솔에 출력


        int r2 = MyMathStatic.sum(n1, n2);  //인스턴스 멤버필드를 사용하는 메소드는 static사용 금지
        System.out.println(r2);


        // MyMathStatic 클래스에 있는 sum메소드
        // 이용해서 n1, n2값을 더한 결과를 콘솔에 출력

    }

}
