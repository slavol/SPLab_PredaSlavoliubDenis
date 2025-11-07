package com.example.lab1.models;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(String paragraphText) {
        int width = 50; // lățime fixă pentru exemplu
        int padding = width - paragraphText.length();
        if (padding < 0) padding = 0;
        System.out.printf("%" + width + "s%n", paragraphText);
    }
}