package com.example.lab1.models.commands;

import com.example.lab1.models.entities.Book;

public class CreateBookCommand implements Command {
    private final CommandContext context;

    public CreateBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        String title = (String) context.getData();
        Book book = new Book(title);
        return context.getBooksService().addBook(book);
    }
}