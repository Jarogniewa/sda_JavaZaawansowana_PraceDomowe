package com.sda.animals;

public class Person {
    Animal animal;

    void showAnimal() {
        System.out.println("My animal is: ");
        animal.introduceYourself();

        System.out.println("Make a sound: ");
        animal.makeSound();

        System.out.println("Perform a trick: ");
        animal.performTrick();
    }

    void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
