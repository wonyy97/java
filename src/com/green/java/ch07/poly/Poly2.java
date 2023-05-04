package com.green.java.ch07.poly;

public class Poly2 {
    public static void main(String[] args) {
        Animal ani1 = new Bulldog();
        boolean r1 = ani1 instanceof Bulldog; //주소값 + instanceof + a가b로 형변환해도 되는지   > 가능하면 true 불가능 false
        System.out.println("r1 : " + r1);
        Bulldog bd1 = (Bulldog) ani1;

        System.out.println("r2 : " + (ani1 instanceof Cat));
        //Cat c1 = (Cat) ani1;

    }
}
