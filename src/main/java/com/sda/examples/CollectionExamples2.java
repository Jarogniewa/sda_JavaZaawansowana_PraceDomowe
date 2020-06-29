package com.sda.examples;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//27.06.2020
public class CollectionExamples2 {
    public static void main(String[] args) {
//        Set<String> texts = new HashSet<>();
//        texts.add("Ala");
//        texts.add("ma");
//        texts.add("kota");
//        texts.add("Kot");
//        texts.add("ma");
//        texts.add("Alę");

        Set<String> texts = Set.of("Ala", "ma", "kota", "Kot", "Alę");

        for (String text : texts)
            System.out.println(text);

//        Stwórz nową mapę <String, Person>
//        String to identyfikator (może być liczba)
//        Person to osoba
//        dodaj dwie różne osoby pod ten sam indentyfikator
//        pokaż zawartość mapy

//        Map<String, Person> people = new HashMap<>();
//        people.put("1", new Person("Karol", "Koltun", now()));
//        people.put("2", new Person("Marta", "Jeczen", LocalDate.of(1989, Month.APRIL, 11)));
//
//        Set<Map.Entry<String, Person> element : elements> {
//            String key = element.getKey();
//            Person value = element.getValue();
//        System.out.println("#" + key + ": " + value);
//
//        //po wpisaniu tego samego identyfikatora, osoba się nadpisze!!!
//        }
    }
}
