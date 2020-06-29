package com.sda.generic;

public class BoxApp {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(1234);
        System.out.println(integerBox.get());

        Box<String> textBox = new Box<>();
        textBox.set("Hello my friend!");
        System.out.println(textBox.get());

//        Box<int> intBox = new Box<>(); - generyk nie może działać na prymitywach

        //Raw type UNIKAJ!
        Box rawBox = new Box();
        rawBox.set("Text");
        Object value = rawBox.get();
        String number = (String) value;
        System.out.println(number);


        }
    public <U> void exampleGenericMethod (U argument) {
        System.out.println("Argument: " + argument.toString());

        System.out.println("Class: " + argument.getClass().getName());
        //to na pewno tu?
    }
//    Integer integer = 1234;
//    textBox.exampleGenericMethod(integer);
//    textBox.exampleGenericMethod(new Box<>());
}
