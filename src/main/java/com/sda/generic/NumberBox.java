package com.sda.generic;

//    27.06.2020
//    Stwórz klasę Box która będzie przechowywała tylko obiekty Number lub dziedziczące po tej klasie.
//    Nazwa nowej klasy: NumberBox, ma być specyfikacją klasy Box
public class NumberBox <T extends Number> extends Box<T> {

//    Zadanie:
//    Nowa metoda NumberBox hasSameValue która przyjmuje drugi NumberBox i sprawdza czy zawartość jest taka sama (zwraca boolean).

//    <U extends Number> boolean hasSameValue(NumberBox<U> otherBox) {
//        //todo: compare doubles with specified precision
//        return otherBox.get().doubleValue() == this.get().doubleValue();
//    }

//  Wildcard - coś nie działa już po kompilacji (NullPointer Exception)
    T number;

    public boolean hasSameValue(NumberBox<?> otherBox) {
        return this.number.intValue() == otherBox.number.intValue();
    }

}
