package com.example.lab1.models;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(String paragraphText) {
        int width = 50; // lățime fixă pentru exemplu
        int padding = (width - paragraphText.length()) / 2;
        if (padding < 0) padding = 0;
        System.out.printf("%" + (padding + paragraphText.length()) + "s%n", paragraphText);
    }
}