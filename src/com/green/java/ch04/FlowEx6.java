package com.green.java.ch04;

import java.util.Scanner;

//switch 사용하여
//mon 값이
//3,4,5 "현재의 계절은 봄 입니다."
//6,7,8 "현재의 계절은 여름입니다."
//9,10,11 "현재의 계절은 가을입니다."
//12,1,2 "현재의 계절은 겨울입니다."

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.printf("현재 월을 입력하세요 (1~12)");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        String season = "";  //대문자로 시작하는 레퍼런스타입은 null값을 입력할 수 있다
        switch (mon) {       // null은 주소값이 없다
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            case 12:
            case 1:
            case 2:
                season = "겨울";
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        if(!"".equals(season)) {    //빈칸값 비교는 빈칸부터 적고 비교해라
            System.out.printf("현재 계절은 %입니다.", season);
        }
    }
}

