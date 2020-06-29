package com.sda.examples;
//27.06.2020 - do skopiowania skądś wcześniej - później wykorzystamy to w CollectionExamles2
import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;

import static java.time.LocalDate.now;

public class PersonApp {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person("Karol", "Koltun", now());
        Person person2 = new Person("Karol", "Nowak", now());
        Person person3 = new Person("Ala", "Nowak", now().minusYears(1));

        people.add(person1);
        people.add(person2);
        people.add(person3);

//        System.out.println(people);

        Person person4 = new Person("Karol", "Koltun", now().minusDays(5));
        people.add(person4);


//        System.out.println(person1.equals(person2));
//        28.06.2020 - iterowanie

//        Pętla for - nie wiem jak wyświetlić konkretną osobę?
//        System.out.println("Zwykły for");
//        for (int i = 0; i<people.size(); i++) {
//            System.out.println(people);
//        }

//        Enhanced for
        System.out.println("Enhanced for");
        for (Person element : people) {
            System.out.println(element);
        }
        System.out.println();

//        Klasa Iterator
        System.out.println("Kasa Iterator");
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

//        Foreach i obiekt consumer - na zajęciach zrobiono to troszkę inaczej
        System.out.println("Foreach i obiekt consumer");
        Consumer<Person> consumer = el -> System.out.println(el);
        people.forEach(consumer);

//        Zadanie: 1. Prosta tablica liczb. 2. Posortowanie jej.

        System.out.println();
        int[] tab1 = new int[] {78, 19, 10, 15, 67, 12, 3, 9, 0};
        System.out.println("Przed sortowaniem");
        for (int i = 0; i<tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }
        System.out.println();
        System.out.println();

        // From lowest to highest - natural order
        Arrays.sort(tab1);
        System.out.println("Po sortowaniu");
            for (int i = 0; i<tab1.length; i++) {
            System.out.print(tab1[i] + " ");
        }

//       Zadanie: 1. Lista tekstów. 2. Posortowanie jej za pomocą Collections.sort oraz metody sort dostarczonej z obiektem listy.

//       Zadanie: dodaj do Person int height i zaimplementuj interfejs Comparable - znów nie zrobiłem :(
//        List<Person> people = Arrays.asList(person1, person3, person2);
//        System.out.println(people);
//        Collections.sort(people);
//        System.out.println(people);

//        Zadanie: Napisz metodę, która: przyjmie listę osób oraz datę i zwróci najwyższą osobę która urodziła się tego dnia
//        - getHighestBornIn(listaOsob, dataUrodzenia)
//        Szybka metoda statyczna w personApp
//        1. Weź otrzymaną listę i stwórz nową z osobami urodzonymi w otrzymanym dniu.
//        2. Posortuj nową listę według wzrostu.
//        3. Zwróć najwyższą osobę.

//        private static Optional<Person> getHighestBornIn(List<Person> people, LocalDate date) {
//            List<Person> bornInDate = new ArrayList<>();
//            for (Person person : people) {
//                if (person.getDateOfBirth().equals(date)) {
//                    bornInDate.add(person);
//                }
//            }
//            if (bornInDate.isEmpty()) {
//                return Optional.empty();
//            }
//            bornInDate.sort(Comparator.reverseOrder());
//            return Optional.of(bornInDate.get(0));
//        }

////        Zadanie: 1. W PersonApp stwórz Predicate który będzie testował czy osoba jest wyższa od 180 cm.
//        Predicate<Person> isHigherThan180 = new Predicate<Person>() {
//                @Override
//            public boolean test(Person person) {
//                    return person.getHeight() > 180;
//                }
//        };
//            Predicate<Person> isHigherThan180Lambda = (Person person) -> {
//                return person.getHeight() >180;
//            };
//
//            Predicate<Person> isHigherThan180ShortLambda = person -> person.getHeight() > 1180;
//
//        System.out.println(isHigherThan180.test(high));
//        System.out.println(isHigherThan180.test(notHigh));
//        //Uwaga: W miejsce Predicate można dać referencję do metody która przyjmuje taki obiekt i zwraca boolean.

//        Zadanie: 2. W PersonApp stwórz Function który przyjmie person i zwróci jej imię.
//    private static void testFunction() {
//        Function<Person, String> {
//            @Override
//            public String apply(Person person);{
//                return person.getFirstName();
//            }
//        }
//    }
    }


}
