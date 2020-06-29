package com.sda.strings;

public class RemoveALetters implements StringOperation {
    @Override
     public String modify (String text) {
        return text.replaceAll("a", "").replaceAll("A", "");
    }
}
