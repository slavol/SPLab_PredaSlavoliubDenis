package com.example.lab1.models.commands;

public class CreateBookCommand implements Command {
    private final CommandContext context;

    public CreateBookCommand(CommandContext context) {
        this.context = context;
    }

    @Override
    public Object execute() {
        String title = (String) context.getData();
        return context.getBooksService().addBook(title);
    }
}