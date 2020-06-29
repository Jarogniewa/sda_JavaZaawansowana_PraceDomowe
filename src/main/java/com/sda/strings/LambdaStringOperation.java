package com.sda.strings;
//28.06.2020
public class LambdaStringOperation {
    public static void main(String[] args) {
//        StringOperation toUpperCase = text -> text.toUpperCase();
//        System.out.println(toUpperCase.modify("karol"));

        StringOperation toUpperCase = String::toUpperCase;
        StringOperation myModify = LambdaStringOperation::myModifyText;

        System.out.println(toUpperCase.modify("karol"));
        System.out.println(myModify.modify("karol"));
        }

        private static String myModifyText(String text){
        return text + " MODIFICATION ";
        }
    }
