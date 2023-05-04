package com.green.java.ch07.abstract2;

public interface Runable extends CanFly, Fightable{ //다중상속 가능하다
    void run();
    void move (int x, int y);
}
