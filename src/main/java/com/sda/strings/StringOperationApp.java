package com.sda.strings;

public class StringOperationApp {
    public static void main(String[] args) {
        System.out.println("Zadanie 9.1: Jeden interface - wiele implementacji.");

        TextUpperCase textUpperCase = new TextUpperCase();
        String before = "karol";
        String after = textUpperCase.modify(before);
        System.out.println(String.format("Before: %s; after: %s", before, after));

        StringOperation stringOperation = new TextUpperCase();
        printModification("karol", new TextUpperCase());

        stringOperation = new TextDuplicate();
        System.out.println(stringOperation.modify("karol"));
        printModification("Karol", new TextDuplicate());

        stringOperation = new RemoveALetters();
        System.out.println(stringOperation.modify("Ania z Zielonego Wzgórza."));
        printModification("Ania z Zielonego Wzgórza.", new RemoveALetters());
    }

    //Nowa metoda która przyjmie: * Tekst * Operację na tekście Wyświetli tekst przed modyfikacją i po modyfikacji
    public static void printModification(String text, StringOperation operation) {
        String modified = operation.modify(text);
        String message = String.format("Before: [%s]; after: [%s].", text, modified);
        System.out.println(message);
    }
}

