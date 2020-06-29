package com.sda.diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    //homework

    private List<Entry> entries = new ArrayList<>();

    private class Entry {
        LocalDate date;
        String text;
    }

    public void writeEntry(String text) {
        // kod dodający nowy wpis z dzisiejszą datą
    }

//    public List<String> getEntriesFrom(LocalDate date) {
//        // kod zwracający wpisy z odpowiednią datą
//    }
}
