package com.green.java.ch07.abstract2;
//인터페이스 이름은 가능한 형용사로 짓는다. 메소드는 동사, 클래스,변수명은 명사
//무조건 추상메소드만 사용가능하다. 그래서 굳이 abstract안적어도 된다.
//자동으로 메소드 앞에 pubilc 이 붙는다. (public abstract)
//구현부가 있는 메소드를 사용할려고 하면 바로 에러뜬다.
//인터페이스는 다중상속이 된다. 메소드에 내용이 없기 때문에 전혀 문제가 되지 않는다. 인터페이스 이름, 상속받고싶은 이름, 상속받고싶은 이름
//인터페이스를 상속받을 때는 implements를 쓴다. 확장할 때는 extends 이름, 이름
public interface Fightable {

    void sum(int x, int y);
    void move(int x, int y);


}
