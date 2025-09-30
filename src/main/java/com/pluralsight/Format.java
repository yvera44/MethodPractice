package com.pluralsight;

public class Format {
    public static void main(String[] args) {

        String fullName = formatName("Yair ", "Vera");
        System.out.println(fullName);

    }
    public static String formatName(String first, String last){
        return first + last;
    }
}
