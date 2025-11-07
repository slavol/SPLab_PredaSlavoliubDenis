package com.example.lab1.models.commands;

import com.example.lab1.models.services.BooksService;

public class CommandContext {
    private final BooksService booksService;
    private final Object data;
    private final Integer id;

    public CommandContext(BooksService booksService, Object data, Integer id) {
        this.booksService = booksService;
        this.data = data;
        this.id = id;
    }

    public BooksService getBooksService() {
        return booksService;
    }

    public Object getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }
}