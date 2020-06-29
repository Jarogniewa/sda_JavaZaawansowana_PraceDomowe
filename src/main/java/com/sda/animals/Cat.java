package com.sda.animals;

public class Cat extends Animal {
    @Override
    void introduceYourself() {
        System.out.println("Cat");

    }

    @Override
    void makeSound() {
        System.out.println("Cat Sound");

    }

    @Override
    void performTrick() {
        System.out.println("Cat Trick");

    }
}
