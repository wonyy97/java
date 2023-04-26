package com.green.java.ch07;

/*
    private 멤버필드에 값을 대입하고 추출.
    <값 주입>
    1. 생성자를 이용해서 호출
    2. setter 메소드를 통해서 호출

    <값 추출>
    1. getter 메소드를 통해서 추출

    값을 넣는 이유는 나중에 추출하기 위해서 이다
*/
public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("김원희", 27, "개발자"); //Human 클래스에 public이 없어도 객체화 가능하다.
//        h1.name = "rrr" private라서 접근 불가.

//        h1.setName("신사임당");
//        h1.setAge(26);
//        h1.setJob("기획자");

        String neme = h1.getName();
        int age = h1.getAge();
        String job = h1.getJob();

        System.out.printf("이름: %s, 나이: %d, 직업: %s\n"
                , neme, age, job);
    }
}
