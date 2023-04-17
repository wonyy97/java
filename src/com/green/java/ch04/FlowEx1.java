package com.green.java.ch04;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일 때, 참인 것은 \n", x);
        //true라면 {중괄호}가 실행된다
        if(x==0) { System.out.println("x==0"); }      // {중괄호} 생략하지 말자!
        if(x!=0) { System.out.println("x!=0"); }
        if(!(x==0)) { System.out.println("!(x==0)"); }
        if(!(x!=0)) { System.out.println("!(x!=0)"); } //이렇게 잘 안씀


    }
}
//츄르 고양이 츄르를 좋아해 우리집 고양이 츄르를 좋아해