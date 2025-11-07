package com.example.lab1.models;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String paragraphText) {
        System.out.println("Align Left: " + paragraphText);
    }
}