package com.green.java.ch02;

//p.37
public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';
        boolean bl = true;
        int finger = 10;

        System.out.printf("b=%d\n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d \n", c, (int) c);
        System.out.printf("finger=[%5d] \n", finger);
        System.out.printf("finger=[%-5d] \n", finger);
        System.out.printf("finger=[%05d] \n", finger);
    }
}
