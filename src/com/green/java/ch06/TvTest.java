package com.green.java.ch06;

public class TvTest {  //클래스 이름을 만드는 순간 타입이 된다.(사용자 정의 클래스)
    public static void main(String[] args) {
            String str = new String("dd");
        Tv tv =  new Tv();  //new 옆에 객체화시키고 싶은 클래스명 기입
            //타입이 Tv라서 Tv객체의 주소값만 담을수 있음,
            // 타입이 다르면 해당객체에 담을수 없다.
            System.out.printf("power : %b\n", tv.power); //주소값 . ~~~
            System.out.printf("channel : %d\n", tv.channel);

            tv.power = true;
            System.out.printf("power : %b\n", tv.power);
            tv.power();
            System.out.printf("power : %b\n", tv.power);

            tv.channelUp();
            tv.channelUp();
            System.out.printf("channel : %d\n", tv.channel);


    }
}
