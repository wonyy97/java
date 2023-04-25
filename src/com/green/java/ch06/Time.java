package com.green.java.ch06;

public class Time {
    private int hour;  //private 외부에서 접근금지
    private int minute; //멤버필드는 은닉화(캡슐화) 시킴
    private int second;

    //생성자 이용해서 최초값을 넣는다. 객체 생성할때만 값을 넣을 수 있다.
    //메소드를 통해서 넣을 수 있다. 그 메소드이름이 Setter
    //빼낼때는 메소드 밖에 없다.
    public int getHour() { //받아올때
        return hour;
    }

    public void setHour(int hour) {   //변경할때
                        //매개변수
        if (1 <= hour && hour <= 23) {
            this.hour = hour;
        }
    }
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
