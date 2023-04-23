package com.green.java.ch06;public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);  //String은 해시태그가 나오지 않는다. overload필요

        ValueBox vb = new ValueBox();
        vb.num = 12;
        System.out.println(vb);

    }
}

class ValueBox {
    int num;


}