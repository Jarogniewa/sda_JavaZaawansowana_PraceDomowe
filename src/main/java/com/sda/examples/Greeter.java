package com.sda.examples;

public class Greeter {
    void greet(){
        System.out.println("Hello, World!");
    }

    void  greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String greeting, String name){
        String meesage = String.format("%s, %s!",greeting, name);// Place holdery!
        System.out.println(meesage);
       // System.out.println(greeting + ", " + name + "!");
    }

}
