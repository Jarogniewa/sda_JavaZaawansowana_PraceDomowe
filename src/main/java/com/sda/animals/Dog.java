package com.sda.animals;

public class Dog extends Animal {
    @Override
    void introduceYourself() {
        System.out.println("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("Dog sound");
    }

    @Override
    void performTrick() {
        System.out.println("Dog trick");
    }
}
