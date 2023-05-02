package com.green.java.ch06;public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);  //String은 해시태그가 나오지 않는다. overload필요

        ValueBox vb = new ValueBox();
        vb.num = 12;
        System.out.println(vb + "안녕");
        //String을 만나면 vb.toString()을 호출한다.
        //int값을 받을려면 오버라이딩 해야함

    }
}

class ValueBox {
    int num;
    @Override
    public String toString () {
        return String.valueOf(num);
    }
}