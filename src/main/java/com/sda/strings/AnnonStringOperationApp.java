package com.sda.strings;

import javax.crypto.spec.PSource;

public class AnnonStringOperationApp {
    public static void main(String[] args) {
        StringOperation truncateText = new StringOperation() {
            @Override
            public String modify(String text) {
                if (text.length() < 5){
                    return text;
                }
                return text.substring(0, 4);
            }
        };

        System.out.println(truncateText.modify("alan"));
        System.out.println(truncateText.modify("Karol Kołtun"));

        StringOperation modifyText = new StringOperation() {
            private static final String TEXT = "Modified: ";
            @Override
            public String modify(String text) {
                    return TEXT + text;
                }
        };
        System.out.println(modifyText.modify("alan"));
        System.out.println(modifyText.modify("Karol Kołtun"));
        System.out.println(modifyText.modify("alan"));
    }
}
