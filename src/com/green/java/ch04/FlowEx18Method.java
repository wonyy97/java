package com.green.java.ch04;

public class FlowEx18Method {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println("============================================");
        gugudanAll(2);
        System.out.println("============================================");
        gugudanchart(2);
        System.out.println("============================================");

       //aruments 아규먼츠, 인수값
        gugudan(2,8);

    }


    public static void gugudan(int num) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }

    public static void gugudanAll(int num) {
        for (int i = 1; i < 9; i++) {
            gugudan(i + 1);
//            for (int j = 0; j < 10; j++) {
//                System.out.printf("%d x %d = %d\n", i,j, i*j);
//            }
            System.out.println();
        }
    }

    public static void gugudanchart(int num) {
        for (int i = 1; i < 9; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d x %d = %d\t", j, i, i * j);
            }
            System.out.println("\t");
        }
    }


    public static void gugudan(int sDan, int eDan) { //인자, 파라미터, 매개변수
        for (int i = sDan; i <= eDan; i++) {
            gugudan(i);

            System.out.println(); //계행은 상황에 따라서 넣기
        }
    }

        //오버로딩  메소드를 여러개 만들수 있는 기법
}






