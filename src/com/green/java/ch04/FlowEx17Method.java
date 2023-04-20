package com.green.java.ch04;

public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 5;

        printStarLine(star);
        printStarLine(4);
        printStarLine(3);
        printStarLine(2);
        printStarLine(1);

        System.out.println("-----------------------");

        printStarRect(4);

        System.out.println("-----------------------");

        printStarRTri(4);
    }

    //수정본
    public static void printStarLine(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    public static void printStarRect(int star) {
        for (int i = 0; i < star; i++) {
            printStarLine(star);
//            for (int j = 0; j < star; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        }
    }

    //중복된 소스는 죄.

    public static void printStarRTri(int star) {
        for (int i = 1; i <= star; i++) {
            printStarLine(i);
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
        }
    }
}


//처음 내가 한거
   /* public static int printStarLine(int star) {
        for (int i = 0; i <= star; i++) {
            System.out.printf("*");
        }
        System.out.print("\n");
    return star;
    }*/

//int를 써서 return을 줘야한다. 그래서 코드가 더 길어짐
// 수정본 > void는 return을 주지 않아도 된다. 좀 더 간결해졌다.

