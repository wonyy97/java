package com.green.java.ch06;

public class TvTest {  //클래스 이름을 만드는 순간 타입이 된다.(사용자 정의 클래스)
    public static void main(String[] args) {
        String str = new String("dd");
        Tv tv = new Tv();  //new 옆에 객체화시키고 싶은 클래스명 기입
        //타입이 Tv라서 Tv객체의 주소값만 담을수 있음,
        // 타입이 다르면 해당객체에 담을수 없다.
        System.out.printf("power : %b\n", tv.power); //주소값 . ~~~
        System.out.printf("channel : %d\n", tv.channel);
        //읽기

        tv.power = true; //쓰기 =  (변경하고 있다)
        System.out.printf("power : %b\n", tv.power);
        tv.power(); //tv객체에 있는 power메소드 호출
        System.out.printf("power : %b\n", tv.power);

        tv.channelUp();//tv객체에 있는 channelUp 호출
        tv.channelUp();
        System.out.printf("channel : %d\n", tv.channel);

        Tv tv2 = tv; //tv변수에 있는 값을 tv2에 복사함 얕은복사
        System.out.printf("channel : %d\n", tv2.channel);

        Tv tv3 = new Tv();
        System.out.printf("channel : %d\n", tv3.channel);
    }
}
//레퍼런스 타입 : 주소값 저장
//프라모티브 타입 : 리터럴값 저장