package com.green.java.ch07;

public class Human { //멤버필드는 무조건 private, 하지만 상수는 public 줘도됨
    private String name;
    private int age;
    private String job;

    public Human() {
//        super(); 자신의 직속 부모의 기본생성자 호출 (Object)
    }

    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

//    getter로 값 추출 하기
//    public String getName() {
//        return name;  //this. 은 생략가능
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getJob() {
//        return job;
//    }

//    public void setName(String name) {
//        this.name = name; //멤버필드를 지칭하고 싶다 하면 this. 쓰면 된다.
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }

}
