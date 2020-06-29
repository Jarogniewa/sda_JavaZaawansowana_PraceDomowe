package com.sda.examples;

public class ExampleApp {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.getClass().getCanonicalName());

        System.out.println("Do zadania 7");

        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Anna");
        greeter.greet("Hi", "Karol");
    }
}
