package com.green.java.ch07.poly;

public class PolyQuiz1 {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog("땅콩이");
        Bulldog bd1 = new Bulldog();
        Cat c1 = new Cat();
        Duck d1 = new Duck();

        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(c1);
        animalCryingCall(d1);
    }


    static void animalCryingCall(Animal ani) {
        ani.crying();
        if (ani instanceof Dog) {
            ((Dog) ani).jump();
//            Dog dog = (Dog)ani;
//            Dog.jump();
        }
    }
}