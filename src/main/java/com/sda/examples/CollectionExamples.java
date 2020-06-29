package com.sda.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {
    public static void main(String[] args) {
//        String[] texts = new String[] {"ala", "ma", "kota"};

        ArrayList<String> textList = new ArrayList<>();
        textList.add("ala");
        textList.add("ma");
        textList.add("kota");

//        System.out.println("Zwykły FOR");
//        for (int i = 0; i < textList.size(); ++i){
//            System.out.println(textList.get(i));
//        }
//        System.out.println();

        System.out.println("Enhanced FOR");
        for (String text : textList) {//enhanced for
            System.out.println(text);
        }


        //mapa
        System.out.println();
        System.out.println("MAPY");

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Karol Kołtun", "1234");
        phoneBook.put("Wiktoria Kamińska", "5678");

        System.out.println("Before");
        System.out.println(phoneBook.get("Karol Kołtun"));
        System.out.println(phoneBook.get("Wiktoria Kamińska"));

        System.out.println("After");
        phoneBook.put("Karol Kołtun", "9012");
        System.out.println(phoneBook.get("Karol Kołtun"));

        //iterowanie po mapie
        System.out.println();
        System.out.println("Iterowanie po mapie");

        Set<Map.Entry<String, String >> entries = phoneBook.entrySet();
        for (Map.Entry<String ,String> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
