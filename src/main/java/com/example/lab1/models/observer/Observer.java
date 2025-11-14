package com.example.lab1.models.observer;

import com.example.lab1.models.entities.Book;

public interface Observer {
    void update(Book book);
}
