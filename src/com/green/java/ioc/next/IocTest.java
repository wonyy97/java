package com.green.java.ioc.next;

import com.green.java.ioc.Tv;

public class IocTest {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Tv tv = TvFactory.gerInstance(args[0]);

        tv.turnOn();
        System.out.println("-------------------");
        tv.turnOff();
    }
}
