package com.example.lab1.models.observer;

import com.example.lab1.models.entities.Book;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Book book);
}
