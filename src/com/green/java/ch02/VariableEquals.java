package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NunberBox nb1 = new NunberBox(10);
        NunberBox nb2 = new NunberBox(10);

        boolean r1 = (nb1 == nb2); //false  주소값 비교
        System.out.println("r1 : " + r1);
        boolean r2 = nb1.equals(nb2);  //Object의 equals는 주소값 비교
        System.out.println("r2 : " + r2);
        //String 비교는 오버라이딩 때문에 비교된다.
    }
}

class NunberBox extends Object{
    private int num;


    NunberBox(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }
    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof NunberBox)) {
            return false;
        }
            NunberBox nb = (NunberBox)obj;
            return this.num == nb.getNum(); //nb.num 으로 해도 된다.
    }
}