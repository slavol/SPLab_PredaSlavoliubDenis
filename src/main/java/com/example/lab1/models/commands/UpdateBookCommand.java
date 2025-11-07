package com.example.lab1.models.commands;

import com.example.lab1.models.entities.Book;

public class UpdateBookCommand implements Command {
    private final CommandContext context;

    public UpdateBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        String title = (String) context.getData();
        Book book = new Book(title);
        return context.getBooksService().updateBook(context.getId(), book);
    }
}