package com.example.lab1.models.services;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BooksService {
    private final Map<Integer, String> books = new HashMap<>();
    private int currentId = 1;

    public List<String> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public String getBook(int id) {
        return books.get(id);
    }

    public String addBook(String title) {
        books.put(currentId, title);
        return "Book added with id=" + currentId++;
    }

    public String updateBook(int id, String title) {
        if (books.containsKey(id)) {
            books.put(id, title);
            return "Book with id=" + id + " updated.";
        } else {
            return "Book not found.";
        }
    }

    public String deleteBook(int id) {
        if (books.containsKey(id)) {
            books.remove(id);
            return "Book with id=" + id + " deleted.";
        } else {
            return "Book not found.";
        }
    }
}